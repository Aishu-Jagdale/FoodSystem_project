package com.dao;

public interface AdminDao {
	boolean adminLogin(String aEmailId,String aPassword);
	boolean adminchangepassword(String aEmailId,String aPassword);
	boolean userLogin(String cEmailId,String cPassword);
	boolean userchangepassword(String cEmailId,String cPassword);

}
