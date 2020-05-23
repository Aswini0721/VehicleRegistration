package com.vehicleregistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vehicleregistration.model.Person;
import com.vehicleregistration.model.Vehicle;
import com.vehicleregistration.service.PersonRegistrationService;
import com.vehicleregistration.service.VehicleRegistrationService;

@Controller
@RequestMapping("/")
public class VehicleRegistrationController {

	@Autowired
	VehicleRegistrationService vehicleRegistrationService;

	@Autowired
	PersonRegistrationService personRegistrationService;
	
	@RequestMapping("/")
	  public String redirectPage() {
	    return "welcome";
	  }

	@RequestMapping(value = { "/showForm" }, method = RequestMethod.GET)
	public String showFormForAdd(Model theModel) {
		Person person = new Person();
		theModel.addAttribute("person", person);
		return "personRegistration";
	}


	@RequestMapping(value = { "/showForm" }, method = RequestMethod.POST)
	public String newUser(@ModelAttribute("person") Person person,ModelMap model) {
		personRegistrationService.save(person);
		model.addAttribute("success", "User " + person.getFirstName()  + person.getLastName()+ " created successfully");
		return "registrationSuccess";
	}


	@GetMapping("/list")
	public String listUsers(ModelMap model) {
		List<Person> persons = personRegistrationService.findAllPersons();
		model.addAttribute("persons", persons);
		return "personsList";
	}

	@GetMapping(value = { "/addVehicle/{personId}" })
	public String showFormForVehicle(Model theModel, @PathVariable int personId) {
		Vehicle vehicle = new Vehicle();
		Person person = personRegistrationService.findById(personId);
		vehicle.setOwner(person.getFirstName());
		theModel.addAttribute("vehicle", vehicle);
		return "vehicleRegistration";
	}

	@PostMapping(value = { "/addVehicle/{personId}" })
	public String newVehicle(@ModelAttribute("vehicle") Vehicle vehicle, @PathVariable int personId,ModelMap model) {
		Person person = personRegistrationService.findById(personId);
		vehicle.setOwner(person.getFirstName());
		System.out.println(personId);
		vehicle.setPerson(person);
		vehicleRegistrationService.save(vehicle);
		model.addAttribute("success", "Brand for Owner " + vehicle.getOwner() + " created successfully");
		return "registrationSuccess";
	}


	@GetMapping("/listVehicles/{personId}")
	public String listVehicle(ModelMap model, @PathVariable int personId) {
		List<Vehicle> vehicles = vehicleRegistrationService.findAllVehiclesById(personId);
		model.addAttribute("vehicles", vehicles);
		return "vehicleList";
	}

	@GetMapping("/search")
	public String listPersonsByBrand(ModelMap model, @RequestParam String keyword) {
		List<Vehicle> vehicles = vehicleRegistrationService.findAllVehiclesByBrand(keyword);
		model.addAttribute("vehicles", vehicles);
		return "searchVehicles";
	}

}
