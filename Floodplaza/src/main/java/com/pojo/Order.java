package com.pojo;

public class Order {
	private int OrderId;
	private String emailId;
	private float totalPrice;
	private String date;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, String emailId, float totalPrice, String date) {
		super();
		OrderId = orderId;
		this.emailId = emailId;
		this.totalPrice = totalPrice;
		this.date = date;
	}
	public int getOrderId() {
		return OrderId;
	}
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Order [OrderId=" + OrderId + ", emailId=" + emailId + ", totalPrice=" + totalPrice + ", date=" + date
				+ "]";
	}
	
	
	
	
	
	
	

}
