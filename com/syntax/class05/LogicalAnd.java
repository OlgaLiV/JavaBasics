package com.syntax.class05;

public class LogicalAnd {
	public static void main(String[] args) {
		// Declare a number
		// If number is between 1 and 10 ---> number is small
		// If number is between 11 and 100 ---> number is medium
		// If number is between 101 and 1001 ---> number is large

		int num = 145;

		if (num >= 1 && num <= 10) {
			System.out.println(num + " is a small number.");
		} else if (num > 10 && num <= 100) {
			System.out.println(num + " is a medium number.");
		} else if (num >= 101 && num <= 1000) {
			System.out.println(num + " is a large number.");
		}else {
			System.out.println(num + " is out of range.");
		}

	}

}
