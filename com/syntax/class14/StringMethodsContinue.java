package com.syntax.class14;

public class StringMethodsContinue {

	public static void main(String[] args) {
		System.out.println("-----------.contains() method------------");

		String str = "Good afternoon all";
		String searchValue = "afternoon";
		boolean contains = str.contains("afternoon");
		System.out.println(contains);

		String searchValue1 = "good";
		boolean isItThere = str.contains(searchValue1);
		System.out.println(isItThere);

		System.out.println("-----------.startsWith() method------------");
		String drink = "water";
		boolean starts = drink.startsWith("w");
		System.out.println(starts);

		System.out.println("-----------.endsWith() method------------");
		boolean ends = drink.endsWith("a");
		System.out.println(ends);

		System.out.println("-----------.equals() method------------");
		String string1 = "Saturday";
		String string2 = "saturday";
		boolean equality = string1.equals(string2);
		System.out.println(equality);

		boolean equalityNoCase = string1.equalsIgnoreCase(string2);
		System.out.println(equalityNoCase);

		String expected = "Password cannot be empty";
		String actual = "Password can not be empty";
		if (expected.equals(actual)) {
			System.out.println("Test pass");
		} else {
			System.out.println("Test failed");
		}
		
		System.out.println("-----------REAL EXSAMPLE OF.equalsIgnoreCase() method------------");
		
		String expectedBrowser = "Chrome";
		
		if(expectedBrowser.equalsIgnoreCase("chrome")) {
			System.out.println("Test exsecuted on Chrome browser");
		}else {
			System.err.println("Test exsecuted NOT on Chrome browser");
		}
		
		
		

	}

}
