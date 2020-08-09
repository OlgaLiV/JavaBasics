package com.syntax.class31;

import java.util.HashMap;

public class MapIntro {
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		//storing objects inside map as a Key and Value Pair = Entry;
		hmap.put(10, "John");//K+V=Entry
		hmap.put(11, "Jane");//K+V=Entry
		hmap.put(12, "James");//K+V=Entry
		
		System.out.println(hmap);
		//cannot have duplicate Keys
		hmap.put(12, "Gozde");
		hmap.put(13, "Olga");
		//can have a duplicate Values
		hmap.put(1, "Olga");
		
		System.out.println(hmap);
		
		//how many objects inside the map?
		int entryObjects = hmap.size();
		System.out.println(entryObjects);
		
		//how to check if map has any elements at all
		boolean isEmpty = hmap.isEmpty();
		System.out.println(isEmpty);
		
		//check if map has specific key or value?		
		boolean hasKey = hmap.containsKey(12);
		System.out.println("Map contains key object 12 = " + hasKey);
		
		boolean hasValue = hmap.containsValue("John");
		System.out.println("Map has value as John = " + hasValue);
		
		//how to retrieve one value from the map?		
		String singleValue = hmap.get(13);
		System.out.println(singleValue);
		
		//how to remove a key from map?		
		hmap.remove(10);
		System.out.println(hmap);
		
		
	}

}
