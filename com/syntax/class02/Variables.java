package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {

		String name = "Olga";
		String lastName = "Litvinenko";
		String grade = "Batch7";
		String city = "Kyiv";
		String state = "Whatever";
		String phoneNumber = "9755609";

		city = "New York";
		state = "NY";
		phoneNumber = "45677765";
		grade = "8E";

		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		
		System.out.println("My name is " + name + " and my last name is " + lastName + ".");
		System.out.println("I live in city of " + city + " state " + state + " and my phone number is " + phoneNumber + "!" );
		System.out.println("************");
		System.out.println();
	}

}
