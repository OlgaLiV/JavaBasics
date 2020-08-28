package com.syntax.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		try {
			int num = scan.nextInt();
		} catch (InputMismatchException ime) {
			//ime.printStackTrace();
			//System.out.println(ime);
			System.out.println(ime.getMessage());
		}

	}

}
