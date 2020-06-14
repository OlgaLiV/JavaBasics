package com.syntax.class04;

import java.util.Scanner;

public class HomeTask2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your age! It should be a number.");
		int age = scan.nextInt();
		
		if (age>=18) {
			System.out.println("Congratulations! You get a driver's license!");
		}else {
			System.out.println("Try to study and get learners permit!");
		}
		
		
		
		
	}

}
