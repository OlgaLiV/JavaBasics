package com.syntax.class20;

public class HW {
	String airLines;
	String destination;
	int flightNo;
	double price;
	int IDNo;

	public HW(String air, String destination) {
		airLines = air;
		this.destination = destination;
	}

	protected HW(String air, String destination, int num) {
		airLines = air;
		this.destination = destination;
		flightNo = num;
	}
	
	HW(String air, String destination, int num, double price) {
		airLines = air;
		this.destination = destination;
		flightNo = num;
		this.price = price;
	}
	
	private HW(String air, String destination, int num, double price, int ID) {
		airLines = air;
		this.destination = destination;
		flightNo = num;
		this.price = price;
		IDNo = ID;
	}
	public void displayInfo() {
		System.out.println("You'll flight " + airLines + " - " + flightNo + " to " + destination + ". The price of your ticket is: $" + price + ". And your ID number is: " + IDNo);
	}
	
	public static void main(String[] args) {
		HW home=new HW("KLM", "Miami");
		home.displayInfo();
		
		HW home1 = new HW("Delta", "Amsterdam", 345);
		home1.displayInfo();
		
		HW home2 = new HW("Lufthansa", "Kiev", 432, 200);
		home2.displayInfo();
		
		HW home3 = new HW("UIA", "New York", 342, 1200, 12345);
		home3.displayInfo();
				
	}
}