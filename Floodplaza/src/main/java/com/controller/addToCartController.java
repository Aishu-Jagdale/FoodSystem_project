package com.controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CartDaoImpl;
import com.pojo.Cart;
import com.pojo.Customer;

@WebServlet("/cart")
public class addToCartController extends HttpServlet {
	
	CartDaoImpl cd = new CartDaoImpl();
	boolean b;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String action = req.getParameter("action");
		
		 if(action==null){
				String emailId = (String)session.getAttribute("uEmail");
				List<Cart> list =  cd.ShowCart(emailId);
				if(list!=null && !(list.isEmpty())) {  
					session.setAttribute("clist", list);
					resp.sendRedirect("cartlist.jsp");
				}
				else {
					resp.sendRedirect("failed.jsp");
				}
			}else if(action.equals("delete") && action!=null) {
				int cartId = Integer.parseInt(req.getParameter("cartId"));
			b = cd.deleteCart(cartId);
			if(b) {
				resp.sendRedirect("cart");
			}
			else {
				resp.sendRedirect("failed.jsp");
			}
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		  String action = req.getParameter("action");
		   
		  if(action.equals("addToCart") && action!=null) {
			      int  foodId = Integer.parseInt(req.getParameter("fid"));
			      int  quantity = Integer.parseInt(req.getParameter("fquan"));
				  String emailId = req.getParameter("email");
				  String foodName = req.getParameter("fname");
				  float price = Float.parseFloat(req.getParameter("fprice"));
				  float totalPrice = Float.parseFloat(req.getParameter("tprice"));
				
		   b = cd.addcart(new Cart(foodId, quantity, emailId, foodName, price, totalPrice));
		   if(b) {
		    resp.sendRedirect("cart");
		   }
		   else {
		    resp.sendRedirect("failed.jsp");
		   }
	     }
		  if(action.equals("update") && action!=null) {
			  int  cartId = Integer.parseInt(req.getParameter("cid"));
			  int  quantity = Integer.parseInt(req.getParameter("fquan"));
			  float totalPrice = Float.parseFloat(req.getParameter("tprice"));
			  Cart c=new Cart();
			  c.setCartId(cartId);
			  c.setQuantity(quantity);
			  c.setTotalPrice(totalPrice);
			  b=cd.updatecart(c);
			   if(b) {
			    resp.sendRedirect("cart");
			   }
			   else {
			    resp.sendRedirect("failed.jsp");
			   }
		     }
		  
		  
	  }
	}
