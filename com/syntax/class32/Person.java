package com.syntax.class32;

public class Person {
//	Create a Person class with following private fields: name, lastName, age, salary. 
//	Variables should be initialized through constructor.
//	Inside the class also create a method to print user details.
//	In Test Class create a Map that will store key in ascending order. 
//  In that map store personId and a Person Object. Print each object details.
	
	private String name, lastName;
	private int age;
	private double salary;
	
	public Person(String name, String lastName, int age, double salary) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;		
	}
	
	public void printDetails() {
		System.out.println("Person's full name is " + name + " " + lastName + ", " + age + ". And salary is = $" + salary);
	}
	
	public String getName() {
		return name;
	}
	 
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getSalary() {
		return salary;
	}

	}


