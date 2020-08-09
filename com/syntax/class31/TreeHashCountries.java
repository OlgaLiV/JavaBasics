package com.syntax.class31;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeHashCountries {

	public static void main(String[] args) {
		Map<String, String> countries = new TreeMap<>();
		countries.put("China", "Beijing");
		countries.put("India", "New Delhi");
		countries.put("USA", "Washington DC");
		countries.put("Indonesia", "Jakarta");
		countries.put("Brazil", "Brasilia");
		countries.put("Ukraine", "Kyiv");
		countries.put("Egypt", "Cairo");
		
		
		Set<String> keys = countries.keySet();
		for (String key : keys) {
			System.out.println("The capital of " + key + " is " + countries.get(key));
		}
		System.out.println("=========================");
		Collection<String> values = countries.values();
		for (String value1 : values) {
			System.out.println(value1);
		}


	}

}
