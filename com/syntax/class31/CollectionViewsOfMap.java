package com.syntax.class31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CollectionViewsOfMap {

	public static void main(String[] args) {
		Map<String, Double> grocery = new LinkedHashMap<>();
		grocery.put("Apple", 1.99);
		grocery.put("Milk", 4.99);
		grocery.put("Ice Cream", 2.99);
		grocery.put("Eggs", 4.99);
		grocery.put("Juce", 5.99);
		grocery.put("Milk", 4.40);		
		System.out.println(grocery);
		
		double value = grocery.get("Milk");
		System.out.println(value);
		
		//how do you get all values
		
		Collection<Double> values = grocery.values();
		System.out.println("===== get values one by one using loop =====");
		for (Double v : values) {
			System.out.println(v);
			
		System.out.println("===== get values one by one using Iterator =====");
		Iterator<Double> it = values.iterator();
		while(it.hasNext()) {
			double vi = it.next();
			System.out.println(vi);
		}
		
		}
		
		//how to get all keys
		Set<String> keys = grocery.keySet();
		System.out.println("===== get keys one by one using Iterator =====");
		Iterator<String> iterator = keys.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("===== get keys one by one using loop =====");
		for(String key:keys) {
			System.out.println(key);
		}
		
		// I want to print key + value together
		
		System.out.println("===== get values AND keys one by one using loop =====");
		for(String key:keys) {
			System.out.println(key + " and it is value is " + grocery.get(key)
			);
		}
	}

}
