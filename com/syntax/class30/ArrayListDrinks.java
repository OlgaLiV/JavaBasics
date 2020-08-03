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
		for (int i = 0; i < drinks.size(); i++) {

			if (drinks.get(i).contains("e") || drinks.get(i).contains("a")) {
				drinks.set(i, "water");
			}

		}

		System.out.print(drinks + " ");

	}
}
