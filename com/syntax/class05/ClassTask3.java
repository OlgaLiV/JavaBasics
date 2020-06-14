package com.syntax.class05;

import java.util.Scanner;

public class ClassTask3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input your Quiz score");
		int quiz = scan.nextInt();

		System.out.println("Please input your Mid Term score");
		int mid = scan.nextInt();

		System.out.println("Please input your Final score");
		int fin = scan.nextInt();

		int average = (quiz + mid + fin) / 3;

		if (average >= 90) {
			System.out.println("Grade = A");
		} else if (average >= 70 && average < 90) {
			System.out.println("Grade = B");
		} else if (average >= 50 && average < 70) {
			System.out.println("Grade = C");
		} else {
			System.out.println("Grade = F");
		}

	}
}
