package com.rlagus.test.ditest;

public class MainClass2 {

	public static void main(String[] args) {
		
		Product pencil = new Pencil();
		
		Store store = new Store(pencil);
		
		Product food = new Food();
		
		Store store2 = new Store(food);
		
	}

}