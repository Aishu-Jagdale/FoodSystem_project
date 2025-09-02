package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Customer;
import com.utility.DataConnect;

public class CustomerDaoImpl implements CustomerDao {
	
		Connection con;
		PreparedStatement ps;
		ResultSet rs;
		Customer cs = null;
		
		
		@Override
		public boolean addCustomer(Customer customer) {
			try {
				
				con = DataConnect.getConnect();
				ps = con.prepareStatement("insert into Customer values(?,?,?,?,?)");
				ps.setString(1, customer.getcName());
				ps.setString(2, customer.getcEmailId());
				ps.setString(3, customer.getcPassword());
				ps.setString(4, customer.getcAddress());
				ps.setString(5, customer.getcContactNo());
				int row = ps.executeUpdate();
				
				if(row>0)
				{
					return true;
				}
				else
				{
					return false;
				}
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return false;
		}
		
		
		@Override
		public boolean updateCustomerById(Customer customer) {
			try
			{	
			con = DataConnect.getConnect();
			ps = con.prepareStatement("update Customer SET cname=?,cpass=?,cadd=?,ccon=? WHERE cemailid=?");
			ps.setString(1, customer.getcName());
			ps.setString(2, customer.getcPassword());
			ps.setString(3, customer.getcAddress());
			ps.setString(4, customer.getcContactNo());
			ps.setString(5, customer.getcEmailId());
			
			int row = ps.executeUpdate();
			
			if(row>0)
			{
				return true;
			}
			else
			{
				return false;
			}
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}
		
		
		@Override
		public boolean deleteCustomerById(String cEmailId) {
			try
			{
				con = DataConnect.getConnect();
				ps = con.prepareStatement("delete from Customer where cemailid = ?");
				ps.setString(1, cEmailId);
				int row = ps.executeUpdate();
				
				if(row>0)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return false;
		}
		
		@Override
		public Customer searchCustomerById(String cEmailId) {
			try
			{
				con = DataConnect.getConnect();
				ps = con.prepareStatement("select * from Customer where cemailid=?");
				ps.setString(1, cEmailId);
				rs = ps.executeQuery();
				
				while(rs.next())
				{
					cs = new Customer();
					cs.setcName(rs.getString("cname"));
					cs.setcEmailId(rs.getString("cemailid"));
					cs.setcPassword(rs.getString("cpass"));
					cs.setcAddress(rs.getString("cadd"));
					cs.setcContactNo(rs.getString("ccon"));
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return cs;
		}
		
		
		@Override
		public List<Customer> getAllCustomer() {
			List<Customer> list = new ArrayList<Customer>();
			try
			{
				con = DataConnect.getConnect();
				ps = con.prepareStatement("select * from Customer");
				rs = ps.executeQuery();
				
				while(rs.next())
				{
					cs = new Customer();
					cs.setcName(rs.getString("cname"));
					cs.setcEmailId(rs.getString("cemailid"));
					cs.setcPassword(rs.getString("cpass"));
					cs.setcAddress(rs.getString("cadd"));
					cs.setcContactNo(rs.getString("ccon"));
					
					list.add(cs);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return list;	
		}
}
