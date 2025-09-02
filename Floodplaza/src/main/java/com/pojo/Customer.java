package com.pojo;

public class Customer {
	private String cName;
	private String cEmailId;
	private String cPassword;
	private String cAddress;
	private String cContactNo;
	
	public Customer() {
		super();
	}

	public Customer(String cName, String cEmailId, String cPassword, String cAddress, String cContactNo) {
		super();
		this.cName = cName;
		this.cEmailId = cEmailId;
		this.cPassword = cPassword;
		this.cAddress = cAddress;
		this.cContactNo = cContactNo;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcEmailId() {
		return cEmailId;
	}

	public void setcEmailId(String cEmailId) {
		this.cEmailId = cEmailId;
	}

	public String getcPassword() {
		return cPassword;
	}

	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public String getcContactNo() {
		return cContactNo;
	}

	public void setcContactNo(String cContactNo) {
		this.cContactNo = cContactNo;
	}

	@Override
	public String toString() {
		return "Customer [cName=" + cName + ", cEmailId=" + cEmailId + ", cPassword=" + cPassword + ", cAddress="
				+ cAddress + ", cContactNo=" + cContactNo + "]";
	}
	
	
	
	

}
