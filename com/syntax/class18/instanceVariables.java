package com.syntax.class18;

public class instanceVariables {
	String name = "Yuriy"; // instance variable

	public static void main(String[] args) {
		String name = "Kristina"; // local variable
		System.out.println(name); // Kristina

		// we create an object or we instanciate a class --> instanceVariables
		instanceVariables obj = new instanceVariables();
		obj.name = "Jane";
		System.out.println(obj.name); // Jane

		// would like to change value from Kristina to Castro
		name = "Castro";
		System.out.println("New value of local variable " + name);

		// would like to change Jane to Ed --> changing value of the instance variable

		obj.name = "Ed";
		System.out.println("New value of instance variable " + obj.name);
		
		System.out.println("Printing value of name using 2 instance");
		instanceVariables obj1 = new instanceVariables();
		System.out.println(obj1.name);
	}

}
