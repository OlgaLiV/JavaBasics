package com.syntax.class28_1;

public class Sedan extends Car {
	double length;

	public Sedan(double carPrice, String color, double length) {
		super(carPrice, color);
		this.length = length;
	}

	public double calculateSalePrice() {
		if (length > 20) {
			return carPrice - (carPrice * 0.05);
		} else {
			return carPrice - (carPrice * 0.1);
		}
	}
}
