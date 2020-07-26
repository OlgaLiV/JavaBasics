package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		// to add values to the arrayList
		arrayList.add("Hello"); // 0
		arrayList.add("Welcome"); // 1
		arrayList.add("How are you"); // 2

		// how many elements inside my arrayList
		int arrayListSize = arrayList.size();
		System.out.println("Size of original arrayList " + arrayListSize);

		// how to access elements from arrayList
		String elementIndex2 = arrayList.get(2);
		System.out.println(elementIndex2);

		// I would like to add more objects to arrayList
		arrayList.add("Doog Bye");
		arrayList.add("Thank you");

		System.out.println("Size of arrayList after adding more String objects " + arrayList.size());

		// Let's remove "Hello"

		arrayList.remove(0);
		System.out.println("Size of arrayList after removing object " + arrayList.size());

		// I want to update value "Good bye"--> "Bye"

		arrayList.set(2, "Bye");
		System.out.println("arrayList after removing object " + arrayList);

	}
}
