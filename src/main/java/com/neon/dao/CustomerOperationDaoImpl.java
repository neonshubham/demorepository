package com.neon.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.neon.bean.Customer;

@Service
public class CustomerOperationDaoImpl implements CustomerOperationDao {


	private static List<Customer> list = new ArrayList<>();

	@Override
	public List<Customer> createCustomer(Customer customer) {

		list.add(customer);
		System.out.println("Record insert succesfully");
		return list;

	}

	@Override
	public void deleteCustomer(int id) {

		list = list.stream().filter(customer -> customer.equals(id)).collect(Collectors.toList());

	}

	@Override
	public Customer updateCustomer(Customer customer, int customerId) {

		list = list.stream().map(c -> {
			if (c.equals(customerId)) {
				list.add(customer); 
				// c.setName(customer.getName()); 
				//c.setAddress(customer.getAddress());
			}
			return c;
		}).collect(Collectors.toList());
		
		return customer;

	}

	@Override
	public List<Customer> listCustomer() {

		list.forEach((x) -> System.out.println(x));
		return list;

	}

}