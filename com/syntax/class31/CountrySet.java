package com.syntax.class31;

import java.util.Iterator;
import java.util.TreeSet;

public class CountrySet {

	public static void main(String[] args) {
		TreeSet<String> countries = new TreeSet<>();
		countries.add("China");
		countries.add("India");
		countries.add("USA");
		countries.add("Indonesia");
		countries.add("Brazil");
		countries.add("Ukraine");
		countries.add("Egypt");
		countries.add("Japan");
		
		Iterator<String> iteratorCountries = countries.iterator();
		while(iteratorCountries.hasNext()) {
			String c = iteratorCountries.next();
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("==============");
		for (String c1 : countries) {
			System.out.print(c1 + " ");
		}
		

	}

}
