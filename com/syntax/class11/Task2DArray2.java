package com.syntax.class11;

public class Task2DArray2 {
	public static void main(String[] args) {
		String[][] students = { { "Olga", "Alex", "Nadia", "Michael" }, { "A", "B", "B", "A" } };
		System.out.println("The student " + students[0][0] + " has " + students[1][0] + " grade.");
		System.out.println("The student " + students[0][1] + " has " + students[1][1] + " grade.");
		System.out.println("The student " + students[0][2] + " has " + students[1][2] + " grade.");
		System.out.println("The student " + students[0][3] + " has " + students[1][3] + " grade.");
	}
}
