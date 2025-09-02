package com.dao;

import java.util.List;

import com.pojo.Customer;

public interface CustomerDao {
	
	boolean addCustomer(Customer customer);
	boolean updateCustomerById(Customer customer);
	boolean deleteCustomerById(String cEmailId);
	List<Customer>getAllCustomer();
	Customer searchCustomerById(String cEmailId);
	

}
