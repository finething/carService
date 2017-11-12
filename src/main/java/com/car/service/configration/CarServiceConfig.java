package com.car.service.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.car.service.dao.CarRepository;
import com.car.service.data.Service;

@Configuration
public class CarServiceConfig {
	@Bean
	public Service getService(){
		return new Service();
	}
	
	

}
