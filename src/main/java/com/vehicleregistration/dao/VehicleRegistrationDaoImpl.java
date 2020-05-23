package com.vehicleregistration.dao;

import java.util.List;

import org.hibernate.Criteria;

import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;


import com.vehicleregistration.model.Vehicle;


@Repository("vehicleRegistrationDao")
public class VehicleRegistrationDaoImpl extends AbstractDao<Integer, Vehicle> implements VehicleRegistrationDao { 
	
	@Override
	public List<Vehicle> findAllVehicles() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("year"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<Vehicle> vehicle = (List<Vehicle>) criteria.list();
		return vehicle;
	}
	
	public void save(Vehicle vehicle) {
		persist(vehicle);
	}

	@Override
	public List<Vehicle> findAllVehiclesById(int id) {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("year"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		criteria.add(Restrictions.eq("person.personId",id));
		List<Vehicle> vehicle = (List<Vehicle>) criteria.list();
		return vehicle;
		
	}

	@Override
	public List<Vehicle> findAllVehiclesByBrand(String brand) {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("year"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		criteria.add(Restrictions.eq("brand",brand));
		List<Vehicle> vehicle = (List<Vehicle>) criteria.list();
		return vehicle;
	}


}
