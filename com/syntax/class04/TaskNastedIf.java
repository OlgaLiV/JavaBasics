package com.syntax.class04;

public class TaskNastedIf {

	public static void main(String[] args) {

		boolean diploma = true;
		double gpa = 2;

		if (diploma) {
			System.out.println("Congratulations!!!");

			if (gpa >= 3.5) {
				System.out.println("You are eligiable to scholarship!");
			} else {
				System.out.println("You should have study harder!");
			}
		} else {
			System.out.println("Do something!");
		}

	}

}
