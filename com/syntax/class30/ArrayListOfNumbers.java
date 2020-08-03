package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOfNumbers {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 2; i < 51; i++) {
			if (i % 2 == 0) {
				numbers.add(i);
			}
		}
		Iterator<Integer> it = numbers.iterator();
		while (it.hasNext()) {
			if (it.next() % 5 == 0) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}
}
