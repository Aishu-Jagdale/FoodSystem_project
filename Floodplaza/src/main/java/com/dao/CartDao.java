package com.dao;

import java.util.List;
import com.pojo.Cart;

public interface CartDao {
	
	boolean addcart(Cart c);
	boolean updatecart(Cart c);
	List<Cart>ShowCart(String emailId);
	boolean deleteCart(int cartId);
	boolean clearCart(String emailId);

}
