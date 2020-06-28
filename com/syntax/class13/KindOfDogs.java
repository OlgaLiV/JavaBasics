package com.syntax.class13;

public class KindOfDogs {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.breed = "Husky";
		dog1.wool = "not long but thick";
		dog1.age = 15;

		System.out.println("Dog #1 is " + dog1.breed + ". It has " + dog1.wool + " wool. Average life " + dog1.breed
				+ " is " + dog1.age + " years.");

		dog1.bark();
		dog1.biting();
		dog1.love();

		System.out.println("===============================");

		Dog dog2 = new Dog();
		dog2.breed = "Bulldog";
		dog2.wool = "short";
		dog2.age = 10;

		System.out.println("Dog #2 is " + dog2.breed + ". It has " + dog2.wool + " wool. Average life " + dog2.breed
				+ " is " + dog2.age + " years.");

		dog2.bark();
		dog2.biting();
		dog2.love();

		System.out.println("===============================");

		Dog dog3 = new Dog();
		dog3.breed = "Labrador";
		dog3.wool = "long and soft";
		dog3.age = 14;

		System.out.println("Dog #3 is " + dog3.breed + ". It has " + dog3.wool + " wool. Average life " + dog3.breed
				+ " is " + dog3.age + " years.");

		dog3.bark();
		dog3.biting();
		dog3.love();

		System.out.println("===============================");
	}
}
