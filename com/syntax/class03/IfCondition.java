package com.syntax.class03;

public class IfCondition {

	public static void main(String[] args) {

		// Declare a number and compare if the number is larger then 100.
		// If it is true, i will print --> my number is large.

		int num = 178;

		boolean result = num > 100;
		System.out.println("Let us check");

		if (num > 100) {
			System.out.println("My number is large");
		} else {
			System.out.println("My number is small");
		}

		System.out.println("The check is complete");

		System.out.println("----------------------------");

		int expectedHours = 15;
		int actualHours = 15;

		if (actualHours >= expectedHours) {
			System.out.println("You will love Java");
		} else {
			System.out.println("You will not love Java");

		}

		System.out.println("----------------------------");

		double budget = 15000;
		double carPrice = 15000;

		if (budget > carPrice) {
			System.out.println("I will buy this a car");
			System.out.println("I am happy!!!");
		} else {
			System.out.println("I will not buy this car");
			System.out.println("I will study Java");
		}
		
		
	}

}
