package com.syntax.class28_1;

public class Truck extends Car {
	double weight;

	public Truck(double carPrice, String color, double weight) {
		super(carPrice, color);
		this.weight = weight;
	}

	public double calculateSalePrice() {
		if (weight > 2000) {
			return carPrice - (carPrice * 0.1);
		} else {
			return carPrice - (carPrice * 0.2);
		}
	}
}
