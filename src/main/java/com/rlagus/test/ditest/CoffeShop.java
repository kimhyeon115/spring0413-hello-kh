package com.rlagus.test.ditest;

public class CoffeShop {
	
	private String shopName;
	private String shopPhone;
	
	private Coffe coffe;
	private Milk milk;	
	
	public CoffeShop() {
		super();
	}

	public CoffeShop(String shopName, String shopPhone, Coffe coffe, Milk milk) {
		super();
		this.shopName = shopName;
		this.shopPhone = shopPhone;
		this.coffe = coffe;
		this.milk = milk;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopPhone() {
		return shopPhone;
	}

	public void setShopPhone(String shopPhone) {
		this.shopPhone = shopPhone;
	}

	public Coffe getCoffe() {
		return coffe;
	}

	public void setCoffe(Coffe coffe) {
		this.coffe = coffe;
	}

	public Milk getMilk() {
		return milk;
	}

	public void setMilk(Milk milk) {
		this.milk = milk;
	}	
	
}
