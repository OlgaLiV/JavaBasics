package com.syntax.class04;

import java.util.Scanner;

public class ScannerIfElse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter 1st number");
		int num1 = scan.nextInt();
		System.out.println("Please enter 2nd number");
		int num2 = scan.nextInt();
		
		System.out.println("----------------");
		System.out.println("Number are " + num1 + " and " + num2);
		System.out.println("----------------");
		
		if(num1>num2) {
		System.out.println(num1 +" is grather than " + num2);
		}else if(num1<num2) {
			System.out.println(num1 +" is smaller than " + num2);
		}else {
			System.out.println(num1 +" is equal " + num2);
		}
		
		
	}

}
