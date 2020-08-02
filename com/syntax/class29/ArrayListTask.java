package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListTask {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Jack");
		names.add("Thomas");
		names.add("Samanta");
		names.add("Naomi");
		names.add("John");

		System.out.println("Is array empty? - " + names.isEmpty());
		System.out.println("Is array contains \"Naomi\"? - " + names.contains("Naomi"));
		System.out.println("The size of array is - " + names.size());
		System.out.println(names);

		ArrayList<String> list = new ArrayList<>();
		list.add("Ahmet");
		list.add("Gozde");
		list.add("Kamila");
		list.add("Ihsan");
		list.add("Artur");

		names.addAll(list);
		System.out.println(names);

	}
}
