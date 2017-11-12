package com.car.service.dao;

import org.springframework.data.repository.CrudRepository;

import com.car.service.model.Car;

public interface CarRepository extends CrudRepository<Car,String>{
	
}

