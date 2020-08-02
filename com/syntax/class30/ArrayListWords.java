package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListWords {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("Family");
		words.add("Ocean");
		words.add("Cake");
		words.add("Sun");
		words.add("Game");
		
		System.out.println(words);
		
		Iterator<String> it = words.iterator();
		while(it.hasNext()) {
			String word = it.next();
			if(word.endsWith("e")) {
				it.remove();
			}
		}
		System.out.print(words + " ");
		
		
	}
}
