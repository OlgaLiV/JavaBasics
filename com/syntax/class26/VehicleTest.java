package com.syntax.class26;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle lambo = new Lamborgini("44566GY65323JK");
		lambo.drive();
		lambo.start();
		lambo.stop();
		lambo.openTrunk();
		int total = Vehicle.getTotal();
		System.out.println(total);

		System.out.println("--- second object ---");
		Car car = new Lamborgini("hiuhuguy55554dcv");
		car.drive();
		car.start();
		car.stop();
		car.openTrunk();

		total = Car.getTotal();
		System.out.println(total);

	}
}
