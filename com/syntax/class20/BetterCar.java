package com.syntax.class20;

public class BetterCar {
	public static String make = "BMW";
	protected String model, color;
	private double price;	
	int year;
	
	public void displayInfo() {
		System.out.println("We build " + color + " " + year + " " + make + " " + model + " for price = $" + price);
	}
	BetterCar(String carModel,String carColor, int carYear, double carPrice){
		model = carModel;
		color = carColor;
		year = carYear;
		price = carPrice;
		
	}
	
	

}
