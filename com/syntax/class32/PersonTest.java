package com.syntax.class32;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PersonTest {
	public static void main(String[] args) {
		Map<Integer, Person> person = new TreeMap<>();
		person.put(1, new Person("Leonardo", "DiCaprio", 45, 100000.0));
		person.put(2, new Person("Pit", "Bull", 43, 200000.0));
		person.put(3, new Person("J", "Lo", 50, 1000000.0));
		person.put(4, new Person("Britney", "Spears", 38, 20000.0));
		person.put(5, new Person("Adel", "Adel", 35, 100560.0));

		Set<Entry<Integer, Person>> entry = person.entrySet();
		Iterator<Entry<Integer, Person>> iterator = entry.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, Person> per = iterator.next();
			Person p = per.getValue();
			p.printDetails();
			System.out.println("**********************");
		}

	}
}
