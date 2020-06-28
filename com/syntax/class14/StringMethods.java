package com.syntax.class14;

public class StringMethods {

	public static void main(String[] args) {

		// 1st way to create a String. This is most popular way
		String name = "Olga"; // literal

		// 2nd way to create a String using new keywod
		String name1 = new String();
		name1 = "Olga";

		System.out.println(name);
		System.out.println(name1);

		// methods of String class

		String school = "Syntax";
		// tells
		int size = school.length();
		System.out.println("-----------.length() method------------");
		System.out.println("The length of the String is = " + size);

		String greetings = " Hello Syntax ";
		int sizeOfDifferentString = greetings.length();
		System.out.println(sizeOfDifferentString);

		System.out.println("-----------.toUpperCase() method------------");
		String city = "Washington DC";
		String newCity = city.toUpperCase();
		System.out.println(newCity);

		System.out.println("-----------.toLowerCase() method------------");
		String lowerCaseString = newCity.toLowerCase();
		System.out.println(lowerCaseString);

		System.out.println("-----------.concat() method------------");
		String country = "USA ";
		String capital = "Washington DS";
		// + with Strings serves as concatenation operator
		// + with numbers serves as arithmetic operator

		System.out.println(country + capital);
		System.out.println(country.concat(capital)); // will work only if both values are of String type
		
        int day = 27;
        String month = " June ";
        
        System.out.println(day + month);
        System.out.println(month + day);
        //System.out.println(month.concat(day)); --> can NOT be used because one of the variables is int. 
        //They should be String both.
        
        System.out.println("-----------.isEmpty() method------------");
        // if length of the String is 0, then it is empty
        String str = "";
        boolean isEmpty = str.isEmpty();
        System.out.println(isEmpty);
        
        System.out.println("-----------.trim() method------------");
        String cat ="Jessy";
        String dog = "      Charly ";
        System.out.println(cat);
        System.out.println(cat.trim());// cut spaces before and after String
        System.out.println(dog);
        System.out.println(dog.trim());// it can NOT cut spaces in the middle
        
        
        
	}

}
