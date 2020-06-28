package com.syntax.class13;

public class Car {

	//define car features in a form or variables
	String make;
	String model;
	String color;
	int year;
	int speed;
	
	//define behavior in a form of method
	public static void main(String[] args) {
		System.out.println("Hello, I am code from main method");
		Car c1 = new Car();
		c1.make = "Toyota";
		c1.model = "Camry";
		c1.color = "Yellow";
		c1.year = 2020;
		c1.speed = 180;
		
		// calling methods
		c1.drive();
		c1.tranportPeople();
		c1.stop();
		c1.reverse();
		
	}
	void drive() {
		System.out.println(make + " can drive");
	}
	
	void reverse() {
		System.out.println(make + " can reverse");
	}
	
	void tranportPeople() {
		System.out.println(make + " can transport people");
	}
	
	void stop() {
		System.out.println(make + " will stop when press break");
		System.out.println(make + " stop");
	}
	
	
	
}
