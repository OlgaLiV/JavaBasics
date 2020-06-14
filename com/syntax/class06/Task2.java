package com.syntax.class06;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your grade");
		String grade = scan.nextLine();
		String explanation;

		switch (grade) {
		case "A":
			explanation = "Excellent";
			break;
		case "B":
			explanation = "Good";
			break;
		case "C":
			explanation = "Avarage";
			break;
		case "D":
			explanation = "Bad";
			break;
		default:
			explanation = "Not Acceptable";
		}
		System.out.println("You entered a " + grade + " grade and this is " + explanation);

	}
}
