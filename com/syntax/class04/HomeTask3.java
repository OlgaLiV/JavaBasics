package com.syntax.class04;

import java.util.Scanner;

public class HomeTask3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your city.");
		String city = scan.nextLine();

		System.out.println("Please enter temperature in Farenheit. It should be a number.");
		int temp = scan.nextInt();
		int celsius = (temp - 32) * 5 / 9;

		System.out.println("The temperature in the city " + city + " is " + celsius + ".");

	}

}
