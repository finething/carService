package com.car.service.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Driver {
	@Id
	private String code;
	private String firstName;
	private String lastName;
	@OneToMany(mappedBy="driver",cascade=CascadeType.ALL)
	//@JsonManagedReference	
	@JsonIgnore
	private List<Car> car;
	
	
	public List<Car> getCar() {
		return car;
	}
	public void setCar(List<Car> car) {
		this.car = car;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public Driver(){
		
	}
	public Driver(String firstName, String lastName, String code) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.code = code;
	}

}
