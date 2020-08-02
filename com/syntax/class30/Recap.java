package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {
	public static void main(String[] args) {
		// I need a collection that can store double objects and have duplicates and i
		// would like to maintain order

		double[] array = { 10, 20, 30, 10.99 };

		ArrayList<Double> numbers = new ArrayList<>();
		numbers.add(10.99);// boxing
		numbers.add(9.99);
		numbers.add(8.99);
		numbers.add(9.99);
		numbers.add(9.99);
		// numbers.add(7); CE: we cannot store Integer Objects into ArrayList of double
		// Objects
		System.out.println(numbers);
		Double num = numbers.get(2);
		double num1 = numbers.get(1);// unboxing

		System.out.println("----  Retrieving using advanced for loop  ----");
		for (Double n : numbers) {
			System.out.print(n + " ");
		}
		System.out.println();

		System.out.println("----  Backwords Retrieving using for loop  ----");
		for (int i = numbers.size() - 1; i >= 0; i--) {
			double myNum = numbers.get(i);
			System.out.print(myNum + " ");
		}
		
		System.out.println();
		
		System.out.println("----  Getting all using Iterator  ----");
		
		Iterator<Double> it=numbers.iterator();
		//next(); --> gets next Object
		//hasNext(); --> checks if there is next element
		//remove(); --> removes element from the collection
		
		double d = it.next();
		double d1 = it.next();
		System.out.println(d1);
		
		while(it.hasNext()) {// print 5 elements because we already takes 2 methods
			System.out.print(it.next() + " ");// to print all 5 elements we need to create a new iterator
		}
		
		System.out.println();
		System.out.println("----  Printing all elements using new Iterator  ----");
		
		Iterator<Double> doubleIt = numbers.iterator();
		while(doubleIt.hasNext()) {
			//System.out.println(doubleIt.next());
			double element = doubleIt.next();
			if(element<10) {
				doubleIt.remove();
			}
		}
		System.out.println(numbers);
		

	}
}
