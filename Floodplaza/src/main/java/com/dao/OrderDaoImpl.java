package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.pojo.Order;
import com.utility.DataConnect;

public class OrderDaoImpl implements OrderDao{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	int row;
	
	@Override
	public Order placeOrder(String emailId) {
		String ODate = new Date().toString();
		float totalPrice = 0;
		Order o = null;
		try
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("select sum(totalprice) as total from Cart where emailId=?");
			ps.setString(1, emailId);
			rs = ps.executeQuery();
			if(rs.next())
			{
				totalPrice = rs.getFloat("total");
			}
				if(totalPrice>0)
				{
					ps = con.prepareStatement("insert into Orders(emailId,totalPrice,date) values(?,?,?)");
					ps.setString(1, emailId);
					ps.setFloat(2, totalPrice);
					ps.setString(3, ODate);
					int row = ps.executeUpdate();
					if(row>0)
					{
						ps = con.prepareStatement("select * from Orders where emailId=? and date=?");
						ps.setString(1, emailId);
						ps.setString(2, ODate);
						rs = ps.executeQuery();
						if(rs.next())
						{
							o = new Order();
							o.setOrderId(rs.getInt("orderId"));
							o.setEmailId(rs.getString("emailId"));
							o.setTotalPrice(rs.getFloat("totalPrice"));
							o.setDate(rs.getString("date"));
						}
					}
				}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return o;
	}
	
	
	@Override
	public List<Order> showOrder() {
		List<Order> l = new ArrayList<>();
		try
		{
			con = DataConnect.getConnect();
			ps= con.prepareStatement("select * from Orders");
			rs=ps.executeQuery();
			while(rs.next())
			{
				Order o = new Order();
				o.setOrderId(rs.getInt("orderId"));
				o.setEmailId(rs.getString("emailId"));
				o.setTotalPrice(rs.getFloat("totalPrice"));
				o.setDate(rs.getString("date"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l;
		
	}
	
	
	

}
