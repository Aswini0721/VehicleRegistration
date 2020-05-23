package com.vehicleregistration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICLE")
public class Vehicle {

	@Id
	@Column(name = "VEH_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vehicleId;

	@Column(name = "OWNER_NAME", nullable = false, unique = true)
	private String owner;

	@Column(name = "MODEL")
	private String model;

	@Column(name = "YEAR")
	private String year;

	@Column(name = "BRAND")
	private String brand;

	@Column(name = "REG_NUM")
	private int registrationNumber;

	@ManyToOne
	@JoinColumn(name="PER_ID")
	private Person person;

	public Vehicle() {

	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", owner=" + owner + ", model=" + model + ", year=" + year
				+ ", brand=" + brand + ", registrationNumber=" + registrationNumber + "]";
	}

	public Vehicle(int vehicleId, String owner, String model, String year, String brand, int registrationNumber) {
		super();
		this.vehicleId = vehicleId;
		this.owner = owner;
		this.model = model;
		this.year = year;
		this.brand = brand;
		this.registrationNumber = registrationNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	
}
