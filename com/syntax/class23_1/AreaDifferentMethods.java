package com.syntax.class23_1;

public class AreaDifferentMethods {
	public double Area(double length, double width) {
		return length * width;
	}

	public double Area(double length) {
		return length * length;
	}

	public double Area(double length, double width, double height) {
		return 2 * length * width + 2 * length * height + 2 * width * height;
	}

}
