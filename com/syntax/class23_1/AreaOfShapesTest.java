package com.syntax.class23_1;

public class AreaOfShapesTest {
	public static void main(String[] args) {
		AreaDifferentMethods obj = new AreaDifferentMethods();
		System.out.println("The area of rectangle = " + obj.area(12, 6));
		System.out.println("The area of square = " + obj.area(3));
		System.out.println("The area of box = " + obj.area(10, 5, 2));
	}
}
