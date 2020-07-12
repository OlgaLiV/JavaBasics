package com.syntax.class21;

public class Constractors {

	String word;

	public Constractors() {
		System.out.println("I am a non argument constractor");
	}

	public Constractors(String word) {
		this(12, word);
		this.word = word;
		System.out.println("I am a parameterized constractor with str = " + word);
	}

	public Constractors(int num) {
		System.out.println("I am a constractor with 1 parameter = " + num);
	}

	public Constractors(int num, String word) {
		System.out.println("I am a constractor with 2 parameters = " + num + " and " + word);
	}

	public static void main(String[] args) {
		Constractors obj = new Constractors("Java");
		System.out.println(obj.word);
	}
	void hello() {
		//this(); // cannot call 
	}
}
