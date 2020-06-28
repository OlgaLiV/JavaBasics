package com.syntax.class13;

public class Phone {
	String name;
	String model;
	String color;
	int memory;

	void call() {
		System.out.println(name + " can call");
	}

	void search() {
		System.out.println(name + " can search smth in Google");
	}

	void message() {
		System.out.println(name + " can send a message");
	}
}
