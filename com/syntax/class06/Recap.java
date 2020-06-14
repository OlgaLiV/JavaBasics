package com.syntax.class06;

public class Recap {
	public static void main(String[] args) {
		int hour = 135;
		String dayTime;

		if (hour >= 1 && hour <= 11) {
			dayTime = "Morning";
		} else if (hour >= 12 && hour <= 15) {
			dayTime = "Afternoon";
		} else if (hour >= 16 && hour <= 20) {
			dayTime = "Evening";
		} else if (hour >= 21 && hour <= 24) {
			dayTime = "Night";
		} else {
			dayTime = "Unknown";
		}
		if (!dayTime.equals("Unknown")) {
			System.out.println("Right now it is " + dayTime);

		}

	}
}
