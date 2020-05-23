package com.vehicleregistration.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
public class Person {

	@Id
	@Column(name = "PER_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int personId;

	@Column(name = "FIRST_NAME", nullable = false, unique = true)
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "ADDRESS")
	private String address;


	public Person() {
	}

	public Person(int personId, String firstName, String lastName, String address) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


}
