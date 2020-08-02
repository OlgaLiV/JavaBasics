package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class RetrivingValuesFromArrayList {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Jack");
		names.add("Thomas");
		names.add("Samanta");
		names.add("Naomi");
		names.add("John");

		// how to retrieve a value

		String str = names.get(3);
		System.out.println(str);

		System.out.println("-----Retrieving values from ArrayList using enchanced for loop-----");
		// to retrieve values one by one

		for (String name : names) {
			System.out.println(name);
			if (name.contentEquals("John")) {
				System.out.println("You are awesome");
			}
		}

		System.out.println("-----Retrieving values from ArrayList using regular for loop-----");

		for (int i = 0; i < names.size(); i++) {
			String s = names.get(i);
			System.out.println(s);
		}
		
		System.out.println("-----Retrieving values from ArrayList using Iterator-----");


		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}

	}
}
