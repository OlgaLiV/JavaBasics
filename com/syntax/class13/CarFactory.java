package com.syntax.class13;

public class CarFactory {
	public static void main(String[] args) {

		// building an object of the car
		Car car1 = new Car();
		car1.make = "Tesla";
		car1.model = "X";
		car1.color = "Red";
		car1.year = 2020;
		car1.speed = 200;
		System.out.println("Make of 1st car is " + car1.make + " and model is " + car1.model + " and it is in "
				+ car1.color + " color.");

		System.out.println("===Accessing methods from Car class using car1===");
		car1.drive();
		car1.reverse();
		car1.tranportPeople();

		// building an object of the car
		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "M5";
		car2.color = "Blue";
		car2.year = 2018;
		car2.speed = 240;
		System.out.println("Make of 2nd car is " + car2.make);

		System.out.println("===Accessing methods from Car class using car2===");
		car2.drive();
		car2.reverse();
		car2.tranportPeople();

		System.out.println("=======");

		Car car3 = new Car();
		car3.make = "AUDI";
		car3.model = "Q8";
		car3.color = "Gray";
		car3.year = 2020;
		car3.speed = 260;
		System.out.println("Make of 3rd car is " + car3.make + " and model is " + car3.model + " and it is in "
				+ car3.color + " color.");
		System.out.println("===Accessing methods from Car class using car3===");
		car3.drive();
		car3.reverse();
		car3.tranportPeople();

		Car car4 = new Car();
		car4.make = "Toyota";
		car4.model = "Camry";
		car4.color = "Black";
		car4.year = 2020;
		car4.speed = 220;
		System.out.println("Make of 4 car is " + car4.make + " and model is " + car4.model + " and it is in "
				+ car4.color + " color.");
		System.out.println("===Accessing methods from Car class using car4===");
		car4.drive();
		car4.reverse();
		car4.tranportPeople();
		// new Bus(); compiler will give an error
		// because we never created Bus class
	}
}
