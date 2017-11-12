package com.car.service.dao;

import org.springframework.data.repository.CrudRepository;

import com.car.service.model.Driver;

public interface DriverRepository extends CrudRepository<Driver,String>{
	
}
