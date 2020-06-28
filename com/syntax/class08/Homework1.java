package com.syntax.class08;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a start of range: ");
		int start = scan.nextInt();

		System.out.println("Please enter the end of range: ");
		int end = scan.nextInt();

		int even = 0;
		int odd = 0;

		for (int pointEven = start; pointEven <= end; pointEven++) {

			if (pointEven % 2 == 0) {
				even += pointEven;

			}

		}
		System.out.println("The sum of even numbers between " + start + " and " + end + " is: " + even);
		System.out.println();
		for (int pointOdd = start; pointOdd <= end; pointOdd++) {
			if (pointOdd % 2 == 1) {
				odd += pointOdd;

			}
		}
		System.out.println("The sum of odd numbers between " + start + " and " + end + " is: " + odd);
	}
}
