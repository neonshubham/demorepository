package com.neon.dao;

import java.util.List;

import com.neon.bean.Customer;


public interface CustomerOperationDao {

	public List<Customer> createCustomer(Customer customer);
	public void deleteCustomer(int id);
	public Customer updateCustomer(Customer customer, int customerId);
	public List<Customer> listCustomer();
}
