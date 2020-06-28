package com.syntax.class15;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Write something");
		String str = scan.nextLine();
		String[] array = str.split(" ");
		String result = "";

		for (int i = array.length - 1; i >= 0; i--) {
			result += array[i] + " ";
		}
		System.out.println("Reversed string is:");
		System.out.println(result.substring(0, result.length() - 1));
	}
}