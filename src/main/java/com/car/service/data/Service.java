package com.car.service.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.car.service.dao.CarRepository;
import com.car.service.dao.DriverRepository;
import com.car.service.model.Car;
import com.car.service.model.Driver;

public class Service {
	@Autowired
	private CarRepository carRepo;
	@Autowired
	private DriverRepository driverRepo;

	public CarRepository getCarRepo() {
		return carRepo;
	}

	public void setCarRepo(CarRepository carRepo) {
		this.carRepo = carRepo;
	}

	public DriverRepository getDriverRepo() {
		return driverRepo;
	}

	public void setDriverRepo(DriverRepository driverRepo) {
		this.driverRepo = driverRepo;
	}

	public Car saveCar(Car car) {		
		return carRepo.save(car);
	}

	public Driver saveDriver(Driver driver) {
		return driverRepo.save(driver);
	}

	public List<Car> getCars() {		
		List<Car> car=new ArrayList<Car>();
		carRepo.findAll().forEach(car::add);		
		return car;
	}
	
	public Car getCar(String id) {		
		return carRepo.findOne(id);
	}

	public List<Driver> getDrivers() {
		List driver=new ArrayList<Driver>();
		driverRepo.findAll().forEach(driver::add);
		return driver;
	}
	
	public Driver getDriver(String id) {		
		return driverRepo.findOne(id);
		
	}

}
