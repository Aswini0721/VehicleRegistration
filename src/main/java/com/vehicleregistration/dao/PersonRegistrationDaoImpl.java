package com.vehicleregistration.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.vehicleregistration.model.Person;

@Repository("personRegistrationDao")
public class PersonRegistrationDaoImpl extends AbstractDao<Integer, Person> implements PersonRegistrationDao {

	public Person findById(int id) {
		Person person = getByKey(id);
		return person;
	}

	public void save(Person person) {
		persist(person);
	}

	@SuppressWarnings("unchecked")
	public List<Person> findAllPersons() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("firstName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<Person> person = (List<Person>) criteria.list();
		return person;
	}

	@Override
	public List<Person> findAllVehiclesById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
