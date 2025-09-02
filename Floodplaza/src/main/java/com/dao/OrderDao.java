package com.dao;

import java.util.List;

import com.pojo.Order;

public interface OrderDao {
	
	Order placeOrder(String emailId);
	List<Order>showOrder();

}
