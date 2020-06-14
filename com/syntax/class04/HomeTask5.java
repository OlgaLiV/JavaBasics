package com.syntax.class04;

import java.util.Scanner;

public class HomeTask5 {
	public static void main(String[] args) {
		Scanner work = new Scanner(System.in);

		System.out.println("Please enter a number of worked ages. It should be a number.");
		int ages = work.nextInt();

		if (ages >= 5) {
			System.out.println("You are eligible for the bonus!");
			System.out.println("Please enter your annual salary. It should be a number.");
			double sal = work.nextDouble();
			if (sal > 50000) {
				System.out.println("Your bonus is 5000!!!");
			} else {
				System.out.println("Your bonus is 3000!!!");
			}
		} else {
			System.out.println("Not today:(");
		}

	}

}
