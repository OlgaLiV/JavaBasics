package com.syntax.class05;

import java.util.Scanner;

public class ScannerLogicalOperators {
	public static void main(String[] args) {
		// Take the age from user and then print
		// if age between 0-3 --> You are a baby
		// if age between 4-5 --> You are a kid
		// if age between 6-12 --> You are a child
		// if age between 13-19 --> You are a teenager
		// if age between 20-64 --> You are a adult
		// if age more than or equal to 65 --> You are a senior

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age.");
		int age = scan.nextInt();

		if (age >= 0 && age <= 3) {
			System.out.println("You are a baby");
		} else if (age >= 4 && age <= 5) {
			System.out.println("You are a kid");
		} else if (age >= 6 && age <= 12) {
			System.out.println("You are a child");
		} else if (age >= 13 && age <= 19) {
			System.out.println("You are a teenager");
		} else if (age >= 20 && age <= 64) {
			System.out.println("You are an adult");
		} else if (age >= 65) {
			System.out.println("Enjoy your life!");
		} else if (age < 0) {
			System.out.println("You are wrong");
		}

	}
}
