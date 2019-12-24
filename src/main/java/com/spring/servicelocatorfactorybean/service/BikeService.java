/**
 * 
 */
package com.spring.servicelocatorfactorybean.service;

import org.springframework.stereotype.Service;

import com.spring.servicelocatorfactorybean.model.Vehicle;
import com.spring.servicelocatorfactorybean.registry.AdapterService;

/**
 * @author user
 *
 */
@Service("Bike")
public class BikeService implements AdapterService<Vehicle> {

	@Override
	public void process(Vehicle request) {
		System.out.println("Inside Bike Service , vehicle Name : "+request.getVehicleName()+"  and Vehicle Type : "+request.getVehicleType());
	}
	
}
