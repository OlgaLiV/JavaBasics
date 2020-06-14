package com.syntax.class06;

import java.util.Scanner;

public class CompareNumbersNestedIf {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the first number:");
		double a = scan.nextDouble();

		System.out.println("Please enter the first number:");
		double b = scan.nextDouble();

		System.out.println("Please enter the first number:");
		double c = scan.nextDouble();

		double largest;

		if (a > b) {
			// here a is already larger than b
			if (a > c) {
				//a is the largest
				largest = a;
			} else {
				//a is larger then b, but c is larger then a
				largest = c;
			}
		} else {
			//here b is already larger then a
			if (b > c) {
				//b is the largest
				largest = b;
			} else {
				//b is larger then a, but c is larger then b
				largest = c;
			}
		}
		System.out.println("The largest nuber is " + largest);

	}
}
