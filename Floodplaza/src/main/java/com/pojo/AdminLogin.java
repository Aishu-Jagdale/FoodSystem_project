package com.pojo;

public class AdminLogin {
	private String aEmailId;
	private String aPassword;
	
	public AdminLogin() {
		super();
	}

	public AdminLogin(String aEmailId, String aPassword) {
		super();
		this.aEmailId = aEmailId;
		this.aPassword = aPassword;
	}
	

	public String getaEmailId() {
		return aEmailId;
	}

	public void setaEmailId(String aEmailId) {
		this.aEmailId = aEmailId;
	}

	public String getaPassword() {
		return aPassword;
	}

	public void setaPassword(String aPassword) {
		this.aPassword = aPassword;
	}

	@Override
	public String toString() {
		return "AdminLogin [aEmailId=" + aEmailId + ", aPassword=" + aPassword + "]";
	}

}
