package com.syntax.class09;

public class Patterns {
	public static void main(String[] args) {
		/*
		 * I want to print this pattern ***** ***** ***** *****
		 */
		System.out.println("-----First way-----");
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----First way-----");
		
		for (int i = 1; i <= 4; i++) {

			for (int j = 101; j <= 105; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
