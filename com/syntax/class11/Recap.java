package com.syntax.class11;

public class Recap {
	public static void main(String[] args) {
		int[] grades = new int[5];

		int size = grades.length;
		System.out.println(size);
		grades[4] = 90;
		grades[3] = 85;
		grades[2] = 92;
		grades[1] = 75;
		grades[0] = 100;
		// 1st way
		int average = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4]) / 5;
		System.out.println(average);
         //2nd way
		int total = 0;
		for (int k = 0; k < size; k++) {
			total += grades[k];
			System.out.println(total / 5);
		}

		System.out.println("===============");

		String[] cities = { "Fairfax", "Kiev", "Tampa", "Washington DS", "Arlington", "NYC", "Lorton", "Chicago" };
		System.out.println("I live in " + cities[2]);

		int i = 1;
		System.out.println("I live in " + cities[i]);

		i += 2;
		System.out.println("I moved to " + cities[i]);
		int cityLength = cities.length;
		System.out.println("Total number of cities is: " + cityLength);
		System.out.println("The last city in the list is: " + cities[cityLength - 1]);

		// To print all the cities
		System.out.println("--------------------");

		for (int j = 0; j < cityLength; j++) {
			System.out.println(cities[j]);
		}

	}
}
