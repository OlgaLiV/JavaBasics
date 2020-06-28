package com.syntax.class08;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter item you want to buy: ");
		String item = scan.nextLine();
		
		System.out.println("Please enter price: ");
		double price = scan.nextDouble();
		
		System.out.println("Please enter cash");
		double cash = scan.nextDouble();
		
		while(cash != price) {
			if (cash > price) {
				System.out.println("Take your change: " + (cash - price));
				break;
			}else {
				System.out.println("Need more money: " + (price - cash));
				break;
			}
		}
		if (cash == price) {
		System.out.println("Thank you for Shopping!");
		}

	}
}
