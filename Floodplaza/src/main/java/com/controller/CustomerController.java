package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CustomerDaoImpl;
import com.pojo.Customer;
import com.pojo.Food;

@WebServlet("/customer")
public class CustomerController extends HttpServlet {
	
	CustomerDaoImpl cd = new CustomerDaoImpl();
	boolean b;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String action = req.getParameter("action");
		if(action==null){
			List<Customer> list =  cd.getAllCustomer();
			if(list!=null && !(list.isEmpty())) {
				session.setAttribute("clist", list);
				resp.sendRedirect("Customerlist.jsp");
			}
			else {
				resp.sendRedirect("failed.jsp");
			}
		}else if(action.equals("delete") && action!=null) {
			String cemail = req.getParameter("cemail");
			b = cd.deleteCustomerById(cemail);
			if(b) {
				resp.sendRedirect("customer");
			}
			else {
				resp.sendRedirect("failed.jsp");
			}
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  String cname = req.getParameter("cname");
		  String cemail = req.getParameter("cemail");
		  String cpassword = req.getParameter("cpass");
		  String caddress = req.getParameter("cadd");
		  String ccontactno = req.getParameter("ccon");
		  String action = req.getParameter("action");
		  
		  
		  if(action.equals("addCustomer") && action!=null) {
		   b = cd.addCustomer(new Customer(cname, cemail, cpassword, caddress, ccontactno));
		   if(b) {
		    resp.sendRedirect("success.jsp");
		   }
		   else {
		    resp.sendRedirect("failed.jsp");
		   }
		  }
		  if(action.equals("updateCustomer") && action!=null) {
		   Customer c = new Customer(cname, cemail, cpassword, caddress, ccontactno);
		   c.setcEmailId(cemail);
		   cd.updateCustomerById(c);
		   if(b) {
		    resp.sendRedirect("success.jsp");
		   }
		   else {
		    resp.sendRedirect("failed.jsp");
		   }
		  }
	}

}
