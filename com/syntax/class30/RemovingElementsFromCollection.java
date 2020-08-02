package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovingElementsFromCollection {
	public static void main(String[] args) {
		
		//create an ArrayList of city names
		
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Kyiv");
		cities.add("LA");
		cities.add("LA");
		cities.add("Istanbul");
		cities.add("DC");
		cities.add("New York");
		
		System.out.println("Original ArrayLis === " + cities);
		
		// Remove cities LA and DC
		
		System.out.println("=====Removing Objects from ArrayList using for loop=====");
		for(int i = 0; i< cities.size(); i++) {
			if(cities.get(i).equals("LA") || cities.get(i).equals("DC")) {
				cities.remove(i);
			}
		}
		System.out.println("ArrayList afer remove elements === " + cities);
		
		System.out.println("=====Removing Objects from ArrayList using enhanced for loop=====");
//		for(String city:cities) {//not good to use enhanced for loop to remove elements
//			if(city.equals("New York")) {
//				cities.remove(city);
//			}
//		}
		System.out.println(cities);
		
		
		System.out.println("=====Removing Objects from ArrayList using Iterator=====");
		cities.add("LA");
		cities.add("LA");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Miami");
		System.out.println(cities);
		
		Iterator<String> citiesIt = cities.iterator();
		
		while(citiesIt.hasNext()) {
			String ci = citiesIt.next();
			if(ci.equals("LA")|| ci.equals("New York")) {
				citiesIt.remove();
			}
		}
		System.out.println("ArrayList after modifications from Iterator === " + cities);
		
	}
}
