package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;

import com.pojo.Customer;
import com.pojo.FeedBack;
import com.utility.DataConnect;


public class FeedBackdaoImpl implements FeedBackDao{
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	FeedBack fd = null;
	
	
	@Override
	public boolean addFeedBack(FeedBack fd) {
		try {
			
			con = DataConnect.getConnect();
			ps = con.prepareStatement("Insert into FeedBack values(?,?,?,?)");
			ps.setString(1, fd.getEmailId());
			ps.setString(2, fd.getReview());
			ps.setInt(3, fd.getRank());
			ps.setString(4, fd.getSuggestion());
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
	public List<FeedBack> getAllFeedback() {
		List<FeedBack> list = new ArrayList<FeedBack>();
		try
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("select * from FeedBack");
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				fd = new FeedBack();
				fd.setEmailId(rs.getString("emailId"));
				fd.setReview(rs.getString("review"));
				fd.setRank(rs.getInt("ranks"));
				fd.setSuggestion(rs.getString("Suggestion"));
				
				list.add(fd);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;	
	}
	
	
	@Override
	public boolean deleteFeedBack(String emailId) {
		try
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("delete from FeedBack where emailId = ?");
			ps.setString(1, emailId);
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
	
	

}
