package com.syntax.class20;

public class Car {
	public static String make;
	private double price;
	protected String model;
	int year;

	public void displayInfo() {
		System.out.println("We build " + year + " " + make + " " + model + " for price = $" + price);
	}
	
	Car(){
		System.out.println("I am a constructor");
	}

	public static void main(String[] args) {
		Car car = new Car();
		/*  
			 Car --> class name
		     car --> variable name
			 new --> keyword
			 Car();--> calling constructor --> block of code initialize the object
		 */
		car.displayInfo();
		System.out.println(car.model);
		
		//static String driver; --> local variables CANNOT BE STATIC
		//System.out.println(driver);
		
	}

}
