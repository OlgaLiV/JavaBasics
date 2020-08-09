package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CitiesSet {
public static void main(String[] args) {
	LinkedHashSet<String> cities = new LinkedHashSet<>();
	cities.add("Paris");
	cities.add("New York");
	cities.add("Doha");
	cities.add("Amsterdam");
	cities.add("Venice");
	cities.add("Barcelona");
	
	Iterator<String> iteratorCities = cities.iterator();
	while (iteratorCities.hasNext()) {
		String str = iteratorCities.next();
		if(str.startsWith("A")) {
			iteratorCities.remove();
			
		}
		
	}
	System.out.println(cities);
	
}
}
