package com.syntax.class28_1;

public class CarTest {
	public static void main(String[] args) {

		Car cars = new Truck(70000, "grey", 2500);
		double price = cars.calculateSalePrice();
		System.out.println("The price of your Truck = $" + price);

		Car sedan = new Sedan(50000, "black", 14);
		double priceSedan = sedan.calculateSalePrice();
		System.out.println("The price of your Seadan = $" + priceSedan);

	}
}
