package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDrinks {
	public static void main(String[] args) {

		ArrayList<String> drinks = new ArrayList<>();
		drinks.add("Pepsi");
		drinks.add("Whisky");
		drinks.add("Juice");
		drinks.add("Wine");
		drinks.add("Lemonade");
		drinks.add("Vodka");
		drinks.add("Water");

		System.out.print(drinks + " ");
		System.out.println();

		Iterator<String> drinksIt = drinks.iterator();
		while (drinksIt.hasNext()) {
			String d = drinksIt.next();
			if (d.contains("e")) {
				drinks.set(0, "water");
			}
//			if (d.contains("a")) {
//				d.replace("a", "water");
//			}
		}
		
		System.out.print(drinks + " ");

	}
}
