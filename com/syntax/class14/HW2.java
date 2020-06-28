package com.syntax.class14;

import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Write something:");
		String str = scan.nextLine();

		if (!str.isEmpty()) {
			if (str.length() % 2 == 1 && str.length() > 2) {
				System.out.println("The character in the middle of the String " + str + " is: " + str.charAt(str.length() / 2));
			}
		} else {
			System.err.println("The string is empty");
		}
	}
}
