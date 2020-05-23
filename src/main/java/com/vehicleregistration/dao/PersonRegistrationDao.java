package com.vehicleregistration.dao;

import java.util.List;

import com.vehicleregistration.model.Person;

public interface PersonRegistrationDao {
	
	Person findById(int id);
        
    void save(Person person);
        
    List<Person> findAllPersons();
    
    List<Person> findAllVehiclesById(int id);
    
   

}
