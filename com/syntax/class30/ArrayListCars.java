package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCars {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Dodge");
		cars.add("Toyota");
		cars.add("Audi");
		cars.add("Ford");
		cars.add("Mazda");
		
		System.out.println(cars);
		
		for(String car:cars) {
			System.out.print(car + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i<cars.size();i++) {
			System.out.print(cars.get(i) + " ");
		}
		
		System.out.println();
		
		Iterator<String> c = cars.iterator();
		while(c.hasNext()) {
			System.out.print(c.next() + " ");
		}
	}
}
