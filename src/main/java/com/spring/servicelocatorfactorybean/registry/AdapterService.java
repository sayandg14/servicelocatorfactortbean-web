/**
 * 
 */
package com.spring.servicelocatorfactorybean.registry;

/**
 * @author user
 *
 */
public interface AdapterService<T> {
	public void process(T request);
}
