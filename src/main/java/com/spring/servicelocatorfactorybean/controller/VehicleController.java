/**
 * 
 */
package com.spring.servicelocatorfactorybean.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.servicelocatorfactorybean.model.Vehicle;
import com.spring.servicelocatorfactorybean.registry.ServiceRegistry;

/**
 * @author user
 *
 */
@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	@Autowired
	private ServiceRegistry serviceRegistry;
	
	@PostMapping
	public void processVehicleDetails(@RequestBody Vehicle vehicle) {
		serviceRegistry.getService(vehicle.getVehicleName()).process(vehicle);
	}
}
