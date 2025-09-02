package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.FoodDaoImpl;
import com.pojo.Food;

@WebServlet("/food")
public class FoodController extends HttpServlet{
	FoodDaoImpl fd = new  FoodDaoImpl();
	boolean b;
	
	//Delete 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session =req.getSession();
		String action = req.getParameter("action");
		 if(action==null){
				List<Food> list =  fd.getAllFood();
				if(list!=null && !(list.isEmpty())) {
					session.setAttribute("flist", list);
					resp.sendRedirect("Foodlist.jsp");
				}
				else {
					resp.sendRedirect("failed.jsp");
				}
		}else if(action.equals("delete") && action!=null) {
		int fid = Integer.parseInt(req.getParameter("fid"));
			b = fd.deleteFoodById(fid);
			if(b) {
				resp.sendRedirect("food");
			}
			else {
				resp.sendRedirect("failed.jsp");
			}
		}
		
	}
	
	//Add and Update
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		  String fname = req.getParameter("fname");
		  String ftype = req.getParameter("ftype");
		  String fcategory = req.getParameter("fcat");
		  float fprice = Float.parseFloat(req.getParameter("fprice"));
		  String action = req.getParameter("action");
		  
		  if(action.equals("addFood") && action!=null) {
		   b = fd.addFood(new Food(fname, ftype, fcategory, fprice));
		   if(b) {
		    resp.sendRedirect("food");
		   }
		   else {
		    resp.sendRedirect("failed.jsp");
		   }
		 }
		  if(action.equals("updateFood") && action!=null) {
		   int fid = Integer.parseInt(req.getParameter("fid"));
		   Food f = new Food(fname,ftype,fcategory,fprice);
		   f.setFoodId(fid);
		   b=fd.updateFoodById(f);
		   if(b) {
		    resp.sendRedirect("food");
		   }
		   else {
		    resp.sendRedirect("failed.jsp");
		   }
		  }
	}

}
