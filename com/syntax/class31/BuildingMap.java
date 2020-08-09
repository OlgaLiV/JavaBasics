package com.syntax.class31;

import java.util.HashMap;

public class BuildingMap {
	public static void main(String[] args) {
		HashMap<Integer, String> building = new HashMap<>();
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Apple");
		building.put(4, "Samsung");
		building.put(5, "Google");
		building.put(6, "Motorolla");
		building.put(7, "LinkedIn");
		
		System.out.println(building);
		System.out.println(building.size());
		
		building.put(4, "Microsoft");
		System.out.println(building);
		
		building.remove(7);
		System.out.println(building);
		
		
	}
}
