package com.syntax.class28_1;

public class Car {

	static double carPrice;
	String color;

	public Car(double carPrice, String color) {
		this.carPrice = carPrice;
		this.color = color;
	}

	public double calculateSalePrice() {
		return carPrice;
	}
}
