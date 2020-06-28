package com.syntax.class10;

import java.util.Scanner;

public class Recap {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many floors your hotel have?");
		int floors = scan.nextInt();

		System.out.println("How many rooms do you have on floor?");
		int rooms = scan.nextInt();
		for (int i = 1; i <= floors; i++) {
			// We just move to anew floor
			System.out.print("Floor # " + i + " --> ");

			// We are iterated the rooms
			for (int j = 1; j <= rooms; j++) {
				System.out.print(i + "." + j + " ");
			}
			// The stairs to next floor
			System.out.println();
		}
	}
}
