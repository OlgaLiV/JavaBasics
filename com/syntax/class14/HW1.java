package com.syntax.class14;

import java.util.Scanner;

public class HW1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any word:");
		String day = scan.nextLine();
		String reverse = "";

		for (int i = day.length() - 1; i >= 0; i--) {
			reverse += day.charAt(i);
		}
		System.out.print("The reverse of word " + day + " is " + reverse);
	}
}
