package com.syntax.class27;

public interface Drivable {// interface is collection of public abstract methods and public static final
							// variables
	public static final String DRIVE = "Drive safe"; // even if we not specified public static final compiler will add
														// it

	// int maxSpeed; must be initial

	public abstract void driving(); // even if we not specified public and abstract compiler will add it

	void breaking();

}

abstract class Motorcycle extends Vehicle implements Drivable {

	public void driving() {
		System.out.println("Motorcycle is driving");
	}

}

class Bike extends Motorcycle {

	public void breaking() {
		System.out.println("Bikes can break");
	}
}

class Vehicle {
	
	public void operateVehicle() {
		System.out.println("To operate any vehicle you need to have driver license");
	}
}
