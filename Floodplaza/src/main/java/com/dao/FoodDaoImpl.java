package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Food;
import com.utility.DataConnect;

public class FoodDaoImpl implements FoodDao {
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	Food food = null;
	
	@Override
	public boolean addFood(Food food) {
		try
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("insert into Food values(foodid,?,?,?,?)");
			ps.setString(1, food.getfName());
			ps.setString(2, food.getfType());
			ps.setString(3, food.getfCategory());
			ps.setFloat(4, food.getfPrice());
			
			int row = ps.executeUpdate();
			if(row>0)
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;	
	}
	
	
	@Override
	public boolean updateFoodById(Food food) {
		try
		{
			con = DataConnect.getConnect();
			ps=con.prepareStatement("Update Food set fname=?,ftype=?,fcategory=?,fprice=? where foodid=?");
			ps.setString(1, food.getfName());
			ps.setString(2, food.getfType());
			ps.setString(3, food.getfCategory());
			ps.setFloat(4, food.getfPrice());
			ps.setInt(5, food.getFoodId());
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
	public boolean deleteFoodById(int foodId) {
		try
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("delete from Food where foodid =?");
			ps.setInt(1,foodId);
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
	public List<Food> getAllFood() {
		List<Food> I = new ArrayList<Food>();
		try
		{
			con = DataConnect.getConnect();
			ps= con.prepareStatement("select * from Food");
			rs = ps.executeQuery();
			while(rs.next())
			{
				food =  new Food();
				food.setFoodId(rs.getInt("foodid"));
				food.setfName(rs.getString("fname"));
				food.setfType(rs.getString("ftype"));
				food.setfCategory(rs.getString("fcategory"));
				food.setfPrice(rs.getFloat("fprice"));	
				I.add(food);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return I;
	}
	
	
	@Override
	public Food searchFoodById(int foodId) {
		try
		{
		con = DataConnect.getConnect();
		ps = con.prepareStatement("select * from Food where foodid = ?");
		ps.setInt(1, foodId);
		rs = ps.executeQuery();
		
		while(rs.next())
		{
			food = new Food();
			food.setFoodId(rs.getInt("foodid"));
			food.setfName(rs.getString("fname"));
			food.setfType(rs.getString("ftype"));
			food.setfCategory(rs.getString("fcategory"));
			food.setfPrice(rs.getFloat("fprice"));	
		 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return food;
	}
}
