package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.FeedBackdaoImpl;
import com.pojo.Customer;
import com.pojo.FeedBack;

@WebServlet("/feedback")
public class FeedBackController extends HttpServlet{
	FeedBackdaoImpl fd = new FeedBackdaoImpl();
	boolean b;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String action = req.getParameter("action");
		 if(action==null){
				List<FeedBack> list =  fd.getAllFeedback();
				if(list!=null && !(list.isEmpty())) {
					session.setAttribute("feedlist", list);
					resp.sendRedirect("feedbacklist.jsp");
				}
				else {
					resp.sendRedirect("failed.jsp");
				}
			}else if(action.equals("delete") && action!=null) {
			String femail = req.getParameter("emailid");
			b = fd.deleteFeedBack(femail);
			if(b) {
				resp.sendRedirect("feedback");
			}
			else {
				resp.sendRedirect("failed.jsp");
			}
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		  String emailId = req.getParameter("femail");
		  String review = req.getParameter("freview");
		  int  rank = Integer.parseInt(req.getParameter("frank"));
		  String suggestion = req.getParameter("fsugg");
		  String action = req.getParameter("action");
		  
		  
		  if(action.equals("addFeedBack") && action!=null) {
		   b = fd.addFeedBack(new FeedBack(emailId, review, rank, suggestion));
		   if(b) {
		    resp.sendRedirect("success.jsp");
		   }
		   else {
		    resp.sendRedirect("failed.jsp");
		   }
		  }
	}

}
