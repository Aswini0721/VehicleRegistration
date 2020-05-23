package com.vehicleregistration.dao;

import java.util.List;


import com.vehicleregistration.model.Vehicle;

public interface VehicleRegistrationDao {

	 void save(Vehicle vehicle);
	 
	 List<Vehicle> findAllVehicles();
	 
	 List<Vehicle> findAllVehiclesById(int id);
	 
	 List<Vehicle> findAllVehiclesByBrand(String brand);
}
