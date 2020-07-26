package com.syntax.class28_1;

public interface Shape {
	double calculateArea(double x);

	double calculatePerimeter(double x);
}

class Circle implements Shape {

	public double calculateArea(double x) {
		double areaCircle = 3.14 * (x * x);
		return areaCircle;
	}

	public double calculatePerimeter(double x) {
		double perimeterCircle = 2 * 3.14 * x;
		return perimeterCircle;
	}
}

class Square implements Shape {
	public double calculateArea(double x) {
		double areaSquare = x * x;
		return areaSquare;
	}

	public double calculatePerimeter(double x) {
		double areaPerimeter = 4 * x;
		return areaPerimeter;
	}
}
