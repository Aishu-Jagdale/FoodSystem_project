package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.dao.AdminDaoImpl;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	
	AdminDaoImpl ad = new AdminDaoImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.invalidate();
		resp.sendRedirect("index.jsp");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String action = req.getParameter("action");
		String type =  req.getParameter("type");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		if(action!=null && action.equals("login")){
			if(type.equals("admin")) {
				boolean b =ad.adminLogin(email, pass);
				if(b) {
					session.setAttribute("aEmail", email);
					resp.sendRedirect("index.jsp");
				}
				else {
					resp.sendRedirect("failed.jsp");
				}
			}
		
			if(type.equals("user")) {
				boolean b =ad.userLogin(email, pass);
				if(b) {
					session.setAttribute("uEmail", email);
					resp.sendRedirect("index.jsp");
				}
				else {
					resp.sendRedirect("failed.jsp");
				}
			}	 	
	    }
		if(action!=null && action.equals("changepass")){
			String npass = req.getParameter("cpass");
			if(type.equals("admin")) {
				boolean b =ad.adminchangepassword(email, npass);
				if(b) {
					resp.sendRedirect("success.jsp");
				}
				else {
					resp.sendRedirect("failed.jsp");
				}
			}
			if(type.equals("user")) {
				boolean b =ad.userchangepassword(email, npass);
				if(b) {
					resp.sendRedirect("success.jsp");
				}
				else {
					resp.sendRedirect("failed.jsp");
				}
			}	 	
	    }
		
	}
}
