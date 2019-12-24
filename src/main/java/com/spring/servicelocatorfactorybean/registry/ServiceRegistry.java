/**
 * 
 */
package com.spring.servicelocatorfactorybean.registry;

/**
 * @author user
 *
 */
public interface ServiceRegistry {
	public <T> AdapterService<T> getService(String serviceName);
}
