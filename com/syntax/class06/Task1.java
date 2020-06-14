package com.syntax.class06;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your country");
		
		String country = scan.nextLine();
		String lang;
		
		switch (country) {
		case "USA":
			lang = "English";
			break;
		case "Ukraine":
			lang = "Ukranian";
			break;
		case "Spain":
			lang = "Spanish";
			break;
		case "Italy":
			lang = "Italian";
			break;
			default:
				lang = "Unknown";
			
		}
		System.out.println("In " + country + " people speak in " + lang + " language.");
		
	}
}
