package com.syntax.class32;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Cities {
//	Create a Map from array of cities that will sort keys in alphabetical order.
//  As a key store the name of the city and as a value store the length of the city 
//  (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
//	If any city name is more than 7 characters remove that city . 
	public static void main(String[] args) {

		Map<String, Integer> cities = new TreeMap<>();
		cities.put("Paris", 5);
		cities.put("Moskow", 6);
		cities.put("Washington DC", 13);
		cities.put("Vienna", 6);
		cities.put("Istanbul", 8);
		cities.put("Cairo", 5);
		cities.put("Kyiv", 4);

		Set<String> keys = cities.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			if (key.length() > 7) {
				it.remove();
			}

		}
		System.out.println(keys);

		System.out.println("----- Improved way ------");

		String[] citieS = { "Washington", "Los Angeles", "New York", "Miami", "Dallas" };

		Map<String, Integer> city = new TreeMap<>();

//	city.put(citieS[0], citieS[0].length());
//	city.put(citieS[1], citieS[1].length());
//	city.put(citieS[2], citieS[2].length());
//	city.put(citieS[3], citieS[3].length());

//	for(int i = 0; i < citieS.length; i++) {
//		city.put(citieS[i], citieS[i].length());
//	}

		for (String c : citieS) {
			if (c.length() < 7) {
				city.put(c, c.length());
			}

		}
		System.out.println(city);

	}
}