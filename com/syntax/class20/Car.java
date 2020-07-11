package com.syntax.class20;

public class Car {
	public static String make;
	private double price;
	protected String model, color;
	int year, door, speed;

	public void displayInfo() {
		System.out.println("We build " + year + " " + make + " " + model + " for price = $" + price);
	}
	
	

	public static void main(String[] args) {
		Car car = new Car();
		/*  
			 Car --> class name
		     car --> variable name
			 new --> keyword
			 Car();--> calling constructor --> block of code initialize the object
		 */
		make = "BMW";
		car.model = "M5";
		car.year = 2021;
		car.color = "pink";
		car.door = 2;
		car.speed = 200;
		car.price = 90000;
		
		Car car1 = new Car();
		car1.model = "i5";
		car1.year = 2020;
		car1.color = "blue";
		car1.door = 4;
		car1.speed = 180;
		
		
		car.displayInfo();
		car1.displayInfo();
		
		
		//static String driver; --> local variables CANNOT BE STATIC
		//System.out.println(driver);
		
	}

}
