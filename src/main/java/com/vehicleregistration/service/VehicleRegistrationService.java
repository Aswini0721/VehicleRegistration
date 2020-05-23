package com.vehicleregistration.service;

import java.util.List;

import com.vehicleregistration.model.Vehicle;

public interface VehicleRegistrationService {

	 void save(Vehicle vehicle);
	 
	 List<Vehicle> findAllVehicles();
	 
	 List<Vehicle> findAllVehiclesById(int id);
	 
	 List<Vehicle> findAllVehiclesByBrand(String brand);
}
