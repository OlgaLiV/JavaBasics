package com.syntax.class32;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SumOfIntegersCollection {
	public static void main(String[] args) {

		// Create a collection of integers in
		// which you can keep duplicates.
		// Write a logic to find sum of all integers

		Collection<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		numbers.add(25);
		numbers.add(30);

		Iterator<Integer> it = numbers.iterator();
		int sum = 0;
		while (it.hasNext()) {

			sum += it.next();

		}
		System.out.println(sum);
	}
}
