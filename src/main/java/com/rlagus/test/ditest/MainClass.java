package com.rlagus.test.ditest;

public class MainClass {

	public static void main(String[] args) {

		CoffeShop coffeshop = new CoffeShop();
		Coffe coffe = new Coffe();
		Milk milk = new Milk();
		
		coffeshop.setCoffe(coffe);
		coffeshop.setMilk(milk);
		
		CoffeShop coffeshop2 = new  CoffeShop("coffeBean", "1234", coffe, milk);
	}

}
