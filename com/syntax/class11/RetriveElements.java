package com.syntax.class11;

public class RetriveElements {
	public static void main(String[] args) {
		char[] grades = { 'A', 'B', 'C', 'D', 'F' };
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + ", ");

		}
		System.out.println();

		System.out.println("-----Printing using advansed loop-----");

		for (char element : grades) {
			System.out.print(element + ", ");

		}
		System.out.println();
		System.out.println("=====================");

		String[] fruits = { "Apple", "Oranges", "Grapes", "Banana", "Cucumber" };
		for (String b : fruits) {
			if (b.equals("Grapes")) {
				System.out.println(b + " is my favorite fruit");
			} else {
				System.out.println(b + " ");
			}

		}
		System.out.println();
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals("Grapes")) {
				System.out.println(fruits[i] + " is my favorite fruit");
			} else {
				System.out.println(fruits[i] + " ");
			}
		}

	}
}
