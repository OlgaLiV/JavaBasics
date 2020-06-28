package com.syntax.class12;

public class Task3 {
	public static void main(String[] args) {
		// Write a java program to find the second
		// largest number in the array?
		// Maximum and minimum number in the array?

		int[] numbers = { 5, 40, 32, 68, 79, 21, 56, 99 };
		int maximum = 0;
		int minimum = 0;
		for (int num : numbers) {
			if (num > maximum) {
				maximum = num;
			}
		}
		System.out.println(maximum);
		for (int num1 : numbers) {
			if (num1 < minimum) {
				minimum = num1;
			}
		}
		System.out.println(minimum);
	}
}
