package com.syntax.class23_1;

public class Circle extends Shape {
	public Circle(double radius) {
		super(radius);

	}

	public void displayResult() {
		double result;
		result = 3.14 * (radius * radius);
		System.out.println(result);
	}
}
