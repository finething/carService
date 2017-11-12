package com.car.service.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
public class Car {
	@Id
	private String identifier;
	private String type;
	private String make;
	private Double price;
	private String code;
	@ManyToOne(cascade=CascadeType.ALL)	
	//@JsonBackReference	
	private Driver driver;
	
	
	

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String id) {
		this.identifier = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Car() {

	}
	

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Car(String id,String type, String make, Double price, String code) {
		this.identifier=id;
		this.type = type;
		this.make = make;
		this.price = price;
		this.code = code;
	}

}
