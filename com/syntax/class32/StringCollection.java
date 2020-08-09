package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringCollection {
	public static void main(String[] args) {
//	Create the collection that will store single
//	uniques Objects of a String type in which order
//	is preserved.
//	Write a logic to concatenate all string from
//	the collection.

		Collection<String> str = new LinkedHashSet<>();
		str.add("Home");
		str.add("Love");
		str.add("Family");
		str.add("Kids");
		str.add("Warm");
		str.add("Sun");

		Iterator<String> it = str.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.print(s + " ");
		}
	}
}
