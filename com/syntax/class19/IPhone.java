package com.syntax.class19;

public class IPhone {
	static String brand = "Apple";
	static String OS = "IOS";
	static boolean touchScreen = true;
	
	String model;
	int memory;
	double price;
	String color;
	
	static void displayInfo () {
		System.out.println("iPhone belongs to brand " + brand + " and it has OS as " + OS + " and all iPhones have touchscreen = " + touchScreen);
	}
	
	void displayDetails () {
		System.out.println("We build iPhone " + model + " with memory = " + memory + " in color " + color + " for price = $" + price);
	}
	
	
}
