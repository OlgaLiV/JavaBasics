package com.syntax.class14;

import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter Mom's first name? ");
		String momsName = scan.nextLine();
		System.out.println("Please enter Dom's first name? ");
		String dadsName = scan.nextLine();
		System.out.println("Is it Boy or Girl? ");
		String baby = scan.nextLine();
		String babyName;

		if (baby.equals("boy")) {
			babyName = dadsName.substring(0, dadsName.length() / 2) + momsName.substring(momsName.length() / 2);
		} else {
			babyName = momsName.substring(0, momsName.length() / 2) + dadsName.substring(dadsName.length() / 2);
		}
		System.out.println(babyName.toUpperCase());
	}
}
