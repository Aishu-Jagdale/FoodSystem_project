package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.dao.CartDaoImpl;
import com.dao.OrderDaoImpl;
import com.pojo.Order;

@WebServlet("/placeorder")
public class OrderController extends HttpServlet{
	
	private static  final long serialVersionUID = 1L;
	OrderDaoImpl od = new OrderDaoImpl();
	CartDaoImpl cd = new CartDaoImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String email = (String)session.getAttribute("uEmail");
		Order o = od.placeOrder(email);
		if(o!=null) {
			boolean b = cd.clearCart(email);
			if(b) {
				req.setAttribute("order", o);
				req.getRequestDispatcher("bill.jsp").forward(req, resp);
			}
		else {
			resp.sendRedirect("failed.jsp");
		}
	 }
	}

}
