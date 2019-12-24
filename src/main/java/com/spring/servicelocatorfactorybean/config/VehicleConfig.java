/**
 * 
 */
package com.spring.servicelocatorfactorybean.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.servicelocatorfactorybean.registry.ServiceRegistry;

/**
 * @author user
 *
 */
@Configuration
public class VehicleConfig {

	@Bean
	public FactoryBean<?> serviceLocatorFactoryBean() {
		ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
		factoryBean.setServiceLocatorInterface(ServiceRegistry.class);
		return factoryBean;
	}
}
