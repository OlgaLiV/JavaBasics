package com.syntax.class02;

public class Homework2 {

	public static void main(String[] args) {

		double num1 = 2.5;
		double num2 = 7.5;
		double sum = num1 + num2;

		double sub = num2 - num1;

		double mul = num1 * num2;

		double div = num2 / num1;

		System.out.println("The addition of 2 numbers " + num1 + " and " + num2 + " is equal to " + sum);
		System.out.println("The substractions of two numbers " + num2 + " and " + num1 + " is equal to " + sub);
		System.out.println("The mutliplication of 2 numbers " + num1 + " and " + num2 + " is equal to " + sum);
		System.out.println("The division of 2 numbers " + num2 + " and " + num1 + " is equal to " + div);

		System.out.println("------------------------------------");

		double num3 = 3.9;

		System.out.println("The square of the " + num3 + " is " + num3 * num3);

		System.out.println("-----------------------------------");

		int width = 5;
		int height = 8;
		int per = (width + height) * 2;
		int area = width * height; 

		System.out.println("The perimeter of the rectangle with width " + width + " and height "  + height
				+ " is equal to " + per + " and the area is " + area);
		
		
	
	}

}
