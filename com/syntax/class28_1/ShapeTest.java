package com.syntax.class28_1;

public class ShapeTest {
	public static void main(String[] args) {
		Shape[] shape = { new Circle(), new Square() };
		for (Shape s : shape) {
			System.out.println("Area is = " + s.calculateArea(5));
			System.out.println("Perimeter is = " + s.calculatePerimeter(2));
			System.out.println("--------------");
		}
	}
}
