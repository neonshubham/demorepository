/**
 * 
 */
package com.neon.bean;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author user368
 *
 */
@EntityScan

public class Customer {
	private int id;
	private String name;
	private String Address;
	
	
	public int getId() {
		return id;
	}
	/**
	 * @return the id

	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */

	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */

	public String getAddress() {
		return Address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}
}



