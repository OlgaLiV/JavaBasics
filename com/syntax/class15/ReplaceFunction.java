package com.syntax.class15;

public class ReplaceFunction {
	public static void main(String[] args) {
		System.out.println("-----------.replace() method------------");

		String me = "I am a good tester. I am a good person";
		String str = "Hello";

		str = str.replace('e', 'E');// can replace a single char or entire words
		System.out.println(str);

		me = me.replace("good", "great");// replace inside String
		System.out.println(me);

		me = me.replace("we", "us");// nothing happened if it not in String
		System.out.println(me);
		// replacing all characters from A-Z
		String fromApplication = "Phone number is 1234567890";
		fromApplication = fromApplication.replaceAll("[A-Z]", "");// hone number is 1234567890
		System.out.println(fromApplication);
		fromApplication = fromApplication.replaceAll("[a-z]", "");
		System.out.println(fromApplication);
		fromApplication = fromApplication.trim();
		System.out.println(fromApplication);

		String another = "Hello12345";
		another = another.replaceAll("[A-Z]", "").replaceAll("[a-z]", "");
		System.out.println(another);

		String anotherWay = "HelloYYdsdghERE65656565656";
		anotherWay = anotherWay.replaceAll("[A-Za-z]", "");
		System.out.println(anotherWay);

		// replacing all numbers
		String mix = "Hello56677 friends 75676878";
		mix = mix.replaceAll("[0-9]", "");
		System.out.println(mix);

		// replacing all characters
		String mix1 = "hello @#%$&^*";
		mix1 = mix1.replaceAll("[^A-Za-z]", "");
		System.out.println(mix1);

	}
}
