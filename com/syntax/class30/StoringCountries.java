package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class StoringCountries {
	public static void main(String[] args) {
		// Country[] country = {new USA("USA"),new Afghanistan("Afghanistan"),new
		// Kazakhstan("Kazakhstan")};

		ArrayList<Country> countries = new ArrayList<>();
		countries.add(new USA("USA"));
		countries.add(new Afghanistan("Afghanistan"));
		countries.add(new Kazakhstan("Kazakhstan"));
		System.out.println("=====Iterating using regular for loop=====");

		for (int i = 0; i < countries.size(); i++) {
			countries.get(i).election();
		}
		System.out.println("=====Iterating using enhainced for loop=====");
		for (Country country : countries) {
			country.election();
		}

		System.out.println("=====Iterating using enhainced Iterator=====");

		Iterator<Country> it = countries.iterator();
		while (it.hasNext()) {
			it.next().election();
		}
	}
}
