package com.car.service.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.car.service.data.Service;
import com.car.service.model.Car;
import com.car.service.model.Driver;

@RestController
public class FrontController {
	@Autowired
	private Service service;

	public Service getSerivice() {
		return service;
	}

	public void setSerivice(Service serivice) {
		this.service = serivice;
	}

	@RequestMapping(value = "/car", method = RequestMethod.POST)
	public Car saveCar(@RequestBody Car car) {
		Driver deriver=new Driver("zz","dd","kk");
		Car car1=new Car("22","GEEP","GEEP",10.0,"Normal");
		Car car2=new Car("11","TOYOTA","TOYOTA",10.0,"Normal");
		List cars=new ArrayList<Car>();
		cars.add(car1);
		cars.add(car2);
	//	deriver.setCar(cars);
		
		car1.setDriver(deriver);
		car2.setDriver(deriver);
		service.saveCar(car1);
		service.saveCar(car2);
		service.saveDriver(deriver);
		return car1;
	}
	
	@RequestMapping(value = "/car/{id}", method = RequestMethod.GET)
	public Car getCar(@PathVariable("id") String id) {
		return service.getCar(id);
	}


	@RequestMapping(value = "/driver", method = RequestMethod.POST)
	public Driver saveDriver(@RequestBody Driver driver) {
		return service.saveDriver(driver);
	}

	@RequestMapping(value = "/car", method = RequestMethod.GET)
	public List<Car> getCars() {			
		return service.getCars();		 
	}
	
	@RequestMapping(value = "/driver/{id}", method = RequestMethod.GET)
	public Driver getDriver(@PathVariable("id") String id) {
		return service.getDriver(id);
		 
	}

	@RequestMapping(value = "/driver", method = RequestMethod.GET)
	public List<Driver> getDrivers(String id) {
		return service.getDrivers();
	}

}
