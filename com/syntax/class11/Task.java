package com.syntax.class11;

public class Task {
	public static void main(String[] args) {
		String[] cars = { "BMW", "Toyota", "Nissan", "Mazda", "Opel", "Dodge" };
		for (String c : cars) {
			System.out.print(c + " ");
		}
		System.out.println();

		System.out.println("==========2=========");

		int[] num = { 5, 40, 32, 68, 79, 21, 56, 99 };
		int sum = 0;
		for (int number : num) {
			sum += number;
		}
		System.out.println(" The sum of array is: " + sum);

		System.out.println("==========3=========");
		String capital = null;
		String[] countries = { "Ukraine", "USA", "Russia", "France" };
		//String[] cap = {"Kyiv", "Washington", "Moscow", "Paris"};
		//for(String c:countries) {
			//System.out.println("The capital of " + c + " is " + cap);
		//}
		for (String c : countries) {
			switch (c) {
			case "Ukraine":
				capital = "Kyiv";
				break;
			case "USA":
				capital = "Washington";
				break;
			case "Russia":
				capital = "Moscow";
				break;
			case "France":
				capital = "Paris";
				break;

			}
			System.out.println("The capital of " + c + " is " + capital);
		}
	}
}
