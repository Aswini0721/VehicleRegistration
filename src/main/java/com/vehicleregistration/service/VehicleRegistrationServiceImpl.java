package com.vehicleregistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vehicleregistration.dao.VehicleRegistrationDao;
import com.vehicleregistration.model.Vehicle;

@Service("vehicleRegistrationService")
@Transactional
public class VehicleRegistrationServiceImpl implements VehicleRegistrationService{
	
	@Autowired
	VehicleRegistrationDao dao;

	@Override
	public List<Vehicle> findAllVehicles() {
		return dao.findAllVehicles();
	}

	@Override
	public void save(Vehicle vehicle) {
		dao.save(vehicle);
		
	}

	@Override
	public List<Vehicle> findAllVehiclesById(int id) {
		return dao.findAllVehiclesById(id);
	}

	@Override
	public List<Vehicle> findAllVehiclesByBrand(String brand) {
		return dao.findAllVehiclesByBrand(brand);
	}

}
