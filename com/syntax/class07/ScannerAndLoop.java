package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//	System.out.println("Please enter your name: ");
//	String name = scan.nextLine();
//	
//	System.out.println("Good afternoon " + name);

		int x = 1;
		while (x <= 5) {
			System.out.println("Please enter your name: ");
			String name = scan.nextLine();

			System.out.println("Good afternoon " + name);
			x++;
		}
	}

}
