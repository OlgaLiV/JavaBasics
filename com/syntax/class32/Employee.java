package com.syntax.class32;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee {
	// Create a Map that will store Employee name and salary.
	// Write a logic to retrieve an employee who gets the
	// highest salary. Output should be in the below format
	// John Smith=$100000

	public static void main(String[] args) {

		Map<String, Double> employee = new HashMap<>();
		employee.put("Kate", 50000.0);
		employee.put("Helen", 84000.0);
		employee.put("Joe", 150000.0);
		employee.put("Ben", 87000.0);
		employee.put("Mary", 122000.0);
		employee.put("Alex", 79000.0);
		employee.put("Bob", 60000.0);
		employee.put("Mia", 200000.0);

		Set<Entry<String, Double>> entry = employee.entrySet();
		Double high = 0.0;
		String key = "";

		for (String keys : employee.keySet()) {
			double value = employee.get(keys);
			if (value > high) {
				key = keys;
				high = value;
			}

		}
		System.out.println(key + " =$" + high);
	}

}
