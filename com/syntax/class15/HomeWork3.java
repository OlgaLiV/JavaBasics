package com.syntax.class15;

import java.util.Scanner;

public class HomeWork3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any word:");
		String word = scan.nextLine();
		String pal = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			pal += word.charAt(i);
		}
		if (word.equalsIgnoreCase(pal)) {
			System.out.println("The string " + word + " is palindrom.");
		} else {
			System.out.println("The string " + word + " is NOT palindrom.");
		}

	}
}
