package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {

		LinkedList<String> food = new LinkedList<>();
		food.add("Beshbarmak");
		food.add("pizza");
		food.add("biryani");
		food.add("tacos");

		String myFood = food.get(2);
		System.out.println(myFood);

		LinkedList<String> deserts = new LinkedList<>();
		deserts.add("cake");
		deserts.add("ice crem");
		deserts.add("cookies");

		food.addAll(deserts);
		System.out.println(food);

		food.remove("pizza");
		System.out.println(food);

		food.set(3, "brownie");
		System.out.println("LinkedList after replacing element --> " + food);

		Iterator<String> it = food.iterator();
		while (it.hasNext()) {
			String foood = it.next();
			System.out.print(foood + " ");
			if (foood.equals("cookies") || foood.equals("brownie")) {
				it.remove();
			}
		}
		System.out.println();
		System.out.println("LinkedList after Iterator is : " + food);

		// let's create link list with Country type of objects

		LinkedList<Country> countries = new LinkedList<>();
		countries.add(new USA("USA"));
		countries.add(new Kazakhstan("Kazakhstan"));
		countries.add(new Afghanistan("Afghanistan"));

		System.out.println("Collection of Country objects has " + countries.size() + " elements");

		for (Country c : countries) {
			c.election();
		}
	}
}
