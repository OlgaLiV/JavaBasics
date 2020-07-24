package com.syntax.class27;

public class MotorcycleTest {
	public static void main(String[] args) {
		System.out.println("-----Object of Drivable type-----");
		Drivable d = new Bike();
		d.breaking();
		d.driving();
		
		System.out.println("-----Object of Motorcycle type-----");
		Motorcycle m = new Bike();
		m.breaking();
		m.driving();
	}
}
