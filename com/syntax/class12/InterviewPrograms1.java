package com.syntax.class12;

public class InterviewPrograms1 {
	public static void main(String[] args) {
		// Write a program to swap 2 numbers 
		//without a temporary variable?

		int a = 20;
		int b = 30;

		a = a + b;
		b = b - a;
		b = -b;
		a = a - b;
		System.out.println("a = " + a + " and b = " + b);

	}
}
