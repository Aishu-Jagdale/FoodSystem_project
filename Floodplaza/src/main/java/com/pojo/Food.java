package com.pojo;

public class Food {
	private int foodId;
	private String fName;
	private String fType;
	private String fCategory;
	private float fPrice;
	
	public Food()
	{
		super();
	}
	public Food(String fName, String fType, String fCategory, float fPrice) {
		super();
		this.fName = fName;
		this.fType = fType;
		this.fCategory = fCategory;
		this.fPrice = fPrice;
	}

	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getfType() {
		return fType;
	}
	public void setfType(String fType) {
		this.fType = fType;
	}
	
	public String getfCategory() {
		return fCategory;
	}
	public void setfCategory(String fCategory) {
		this.fCategory = fCategory;
	}
	public float getfPrice() {
		return fPrice;
	}
	public void setfPrice(float fPrice) {
		this.fPrice = fPrice;
	}
	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", fName=" + fName + ", fType=" + fType + ", fCategory=" + fCategory
				+ ", fPrice=" + fPrice + "]";
	}
	

}
