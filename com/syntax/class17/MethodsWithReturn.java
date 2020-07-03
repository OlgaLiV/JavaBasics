package com.syntax.class17;

public class MethodsWithReturn {
	public static void main(String[] args) {
		MethodsWithReturn obj = new MethodsWithReturn();
		boolean isItEven = obj.isEven(12);

		System.out.println(isItEven);

		String upperValue = obj.convertToUpperCase("Thao");
		System.out.println(upperValue);

	}
	// create a method that will accept
	// int value and return whether number is even

	boolean isEven(int a) {
		boolean even;
		if (a % 2 == 0) {
			even = true;
		} else {
			even = false;
		}
		return even;

	}
	// create a method that will accept 2
	// int numbers and return the largest number

	int getLargest(int a, int b) {
		int largest;
		if (a > b) {
			largest = a;
		} else {
			largest = b;
		}
		return largest; // return values must be same
	}

	// create a method that will accept String value and returns value
	// all in Upper case

	String convertToUpperCase(String value) {
		return value.toUpperCase();
	}

}
