package com.vehicleregistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vehicleregistration.dao.PersonRegistrationDao;
import com.vehicleregistration.model.Person;


@Service("personRegistrationService")
@Transactional
public class PersonRegistrationServiceImpl implements PersonRegistrationService{
	
	@Autowired
	PersonRegistrationDao dao;
	
	
	@Override
	public Person findById(int id) {
		return dao.findById(id);
	}

	@Override
	public void save(Person person) {
		dao.save(person);
		
	}

	@Override
	public List<Person> findAllPersons() {
		return 	dao.findAllPersons();
	}

	@Override
	public List<Person> findAllVehiclesById(int id) {
		return dao.findAllVehiclesById(id);
	}

}
