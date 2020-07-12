package com.syntax.class21;

public class Student {
	String name, adress;

	public Student(String name, String adress) {
		this.name = name;
		this.adress = adress;
	}

	public void displayInfo() {
		System.out.println("Student name is " + name + " and adress is " + adress);
	}

	public static void main(String[] args) {
		Student obj = new Student("Michael", "Whatever");
		obj.displayInfo();
	}
}
