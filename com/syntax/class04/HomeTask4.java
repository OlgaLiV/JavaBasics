package com.syntax.class04;

import java.util.Scanner;

public class HomeTask4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Do you have a credit card? Please type yes or no.");
		String answer = scan.nextLine();
		String yes = "yes";
		String no = "no";

		if (answer.equalsIgnoreCase("no")) {
			System.out.println("Do you want a credit card?");
		} else if (answer.equalsIgnoreCase("yes")) {
			System.out.println("What is your ballance on the card?");
			Double ballance = scan.nextDouble();
			if (ballance >= 1000) {
				System.out.println("Pay immediately!!!");
			} else {
				System.out.println("You can spend more!");
			}
		}

	}

}
