package com.syntax.class31;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {

	public static void main(String[] args) {
		// create a map of grocery that will hold item: price
		
		Map<String, Double> grocery = new HashMap<>();
		grocery.put("Apple", 1.99);
		grocery.put("Milk", 4.99);
		grocery.put("Ice Cream", 2.99);
		grocery.put("Eggs", 4.99);
		grocery.put("Juce", 5.99);
		grocery.put("Milk", 4.40);

		
		System.out.println(grocery);
		
		Map<String, Double> mall = new LinkedHashMap<>();
		mall.put("Colone", 99.99);
		mall.put("T-Shirt", 15.99);
		mall.put("Shoes", 99.99);
		mall.put("Soap", 1.99);
		mall.put("Colone", 99.99);
		mall.put("Tea", 3.99);
	
		
		System.out.println(mall);
		
		Map<String, Double> shoppingList = new TreeMap<>();
		shoppingList.putAll(grocery);
		shoppingList.putAll(mall);
		shoppingList.put("Computer", null);
		//shoppingList.put(null, 10.99);
		System.out.println(shoppingList);
		
		Map<String, Double> hTable = new Hashtable<>();
		hTable.put("Horse", 600000.0);
		hTable.put("Car", 600000.0);
		hTable.put("Food", 100.0);
		hTable.put("Cup", 10.0);
		//Hashtable does not allows null values and keys
//		hTable.put(null, 1.99);
//		hTable.put("Cup", null);
		
		System.out.println(hTable);
		
		// adding null keys and null values to the HashMap
		grocery.put(null, null);
		grocery.put(null, 0.99);
		System.out.println(grocery);
		
		// adding null keys and null values to the HashMap
		mall.put(null, 0.99);
		mall.put(null, null);
		System.out.println(mall);
	}

}
