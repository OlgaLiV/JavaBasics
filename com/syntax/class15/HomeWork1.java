package com.syntax.class15;

import java.util.Scanner;

public class HomeWork1 {
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
