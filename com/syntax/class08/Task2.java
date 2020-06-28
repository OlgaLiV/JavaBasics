package com.syntax.class08;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

		for (int i = 101; i <= 110; i++) {
			System.out.println("Do you want to apply for a credit card?");
			String card = scan.nextLine();
			
			if (card.equals("yes")) {
				System.out.println("Congrats!");
				break;
			}

			}
		}
	}

