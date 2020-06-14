package com.syntax.class05;

import java.util.Scanner;

public class ClassTask1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please Insert your heights in inches");

//		double height = scan.nextDouble();
//
//		if (height < 60 && height > 0) {
//			System.out.println("You're short");
//		} else if (height >= 60 && height <= 72) {
//			System.out.println("You're medium");
//		} else if (height >= 72) {
//			System.out.println("You're tall");
//		} else {
//			System.out.println("Incorrect input");
	//	}
		//Scanner scan = new Scanner(System.in);
		  
//		  System.out.println("Please enter your mark");
//		  int mark = scan.nextInt();
//		  
//		  if (mark > 80) {
//		    System.out.println("Your grade is A");
//		  } else if (mark > 60 && mark <= 80) {
//		    System.out.println("Your grade is B");
//		  } else if (mark >50 && mark <= 60) {
//		    System.out.println("Your grade is C");
//		  } else if (mark > 45 && mark <= 50) {
//		    System.out.println("Your grade is D");
//		  } else if (mark > 25 && mark <= 45) {
//		    System.out.println("Your grade is E");
//		  } else if (mark > 1 && mark <= 25) {
//		    System.out.println("Your grade is F");
//		  } else {
//		    System.out.println("Please enter valid mark");
//		  }
//		  
		  
		  System.out.println("Please enter two strings");
		  	String word1 = scan.nextLine();
		    String word2 = scan.nextLine();
		    
		    System.out.println("Please enter two numbers");
		    int int1 = scan.nextInt();
		    int int2 = scan.nextInt();
		    
		    if (int1 == int2 && word1 == word2) {
		      System.out.println("AND");
		    }
		    if (int1 == int2 || word1 == word2) {
		      System.out.println("OR");
		    }
		    if (int1 != int2 && word1 != word2) {
		      System.out.println("NONE");
		    }
		  
		}

	}


