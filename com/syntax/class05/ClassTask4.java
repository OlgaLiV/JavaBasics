package com.syntax.class05;

import java.util.Scanner;

public class ClassTask4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your birth month:");
		String month = scan.nextLine();

		if (month.equals("December") || month.equals("January") || month.equals("February")) {
			System.out.println("Winter");
			System.out.println("You were born in winter");
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			System.out.println("Spring");
			System.out.println("You were born in spring");
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			System.out.println("Summer");
			System.out.println("You were born in summer");
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			System.out.println("Fall");
			System.out.println("You were born in autumn");
		}

	}
}
