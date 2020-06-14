package com.syntax.class06;

public class NestedIfTwoWays {
	public static void main(String[] args) {
		double a = 5, b = 9, c = 1;
		double largest = 0;
// 1st way
//		if (a > b && a > c) {
//			largest = a;
//		} else if (b > a && b > c) {
//			largest = b;
//		} else if (c > a && c > b) {
//			largest = c;
//		}
//		System.out.println("Largest number is " + largest);

		// 2nd way
		if (a > b && a > c) {
			// a is the largest
			largest = a;
		} else if (b > c) {// a is not the largest, I am comparing b and c
			// b is a largest
			largest = b;
		} else {// a is not the largest, b is not the largest
			// c is the largest
			largest = c;
		}
		System.out.println("The largest number is " + largest);
	}
}
