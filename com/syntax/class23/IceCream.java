package com.syntax.class23;

public class IceCream {
	String flavor, brand, color;

	public IceCream(String flavor, String brand, String color) {
		this.flavor = flavor;
		this.brand = brand;
		this.color = color;
	}

}

class Gelato extends IceCream {
	public Gelato(String flavor, String brand, String color) {
		super(flavor, brand, color);
	}
}

class Sorbeto extends IceCream {
	double price;

	public Sorbeto(String flavor, String brand, String color, double price) {
		super(flavor, brand, color);
		this.price = price;

	}

	public Sorbeto(String flavor, String brand, String color) {
		super(flavor, brand, color);
	}

}

class MiniSorbeto extends Sorbeto {
	int calories;
	
	public MiniSorbeto(String flavor, String brand, String color, double price, int calories) {
		super(flavor, brand, color, price);
		this.calories = calories;

	}
}