package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please Insert your name!");

		String name = scan.nextLine();

		System.out.println("Please enter your age in double!");

		double age = scan.nextDouble();
		System.out.println("Your name is " + name + " and the age is " + age);

	}

}
