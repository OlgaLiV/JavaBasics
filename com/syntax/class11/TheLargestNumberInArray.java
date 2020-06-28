package com.syntax.class11;

public class TheLargestNumberInArray {
	public static void main(String[] args) {
		int[] numbers = { 5, 40, 32, 68, 79, 21, 56, 99 };
		int largest = 0;
		for (int num : numbers) {
			if (num > largest) {
				largest = num;
			}
		}
		System.out.println(largest);
	}
}