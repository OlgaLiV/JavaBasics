package com.syntax.class05;

public class MoreLogicalOperators {
	public static void main(String[] args) {
		// We have 7 days of week
		// if day is 2,4 --> SDLC class
		// if day is 6,7 --> Java class
		// if day is 3 --> Review class
		// if day is 1, 5 --> No class

		int day = 5;
		// To compare the equality of two numbers we use ==

		if (day == 2 || day == 4) {
			System.out.println("SDLC class");
		} else if (day == 6 || day == 7) {
			System.out.println("JAVA class");
		} else if (day == 1 || day == 5) {
			System.out.println("NO class");
		} else if (day == 3) {
			System.out.println("Review class");
		} else {
			System.out.println("Invalid entry");
		}

		System.out.println("------Using String--------");
		// To compare the equality of two strings we use .equals()

		String day2 = "Sunday";
		if (day2.equals("Tuesday") || day2.contentEquals("Thursday")) {
			System.out.println("SDLC class");
		} else if (day2.equals("Saturday") || day2.equals("Sunday")) {
			System.out.println("JAVA class");
		} else if (day2.equals("Monday") || day2.equals("Friday")) {
			System.out.println("NO class");
		} else if (day2.equals("Wednesday")) {
			System.out.println("Review class");
		} else {
			System.out.println("Invalid entry");
		}

	}
}
