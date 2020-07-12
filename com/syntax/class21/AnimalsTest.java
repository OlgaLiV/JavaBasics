package com.syntax.class21;

public class AnimalsTest {
	public static void main(String[] args) {
		// object of parent class has an access to all features(var) and method of it's
		// own class ONLY
		Animal a = new Animal();
		a.breed = "Something";
		a.color = "grey";
		a.paws = 4;
		a.sleep();
		a.eat();
		// object of parent class has an access to all features(var) and method of it's
		// own class and parent class
		Dog dog = new Dog();
		dog.breed = "Husky";
		dog.color = "Yellow";
		dog.paws = 4;
		dog.tail = true;

		dog.eat();
		dog.sleep();
		dog.bark();

		Cat cat = new Cat();
		cat.breed = "Siberian";
		cat.color = "white";
		cat.paws = 4;
		cat.fur = "Soft";
		cat.tail = true;

		cat.purr();
		cat.eat();
		cat.sleep();
		
		Kitty kitty = new Kitty();
		kitty.breed = "British";
		kitty.cry = true;
		kitty.color = "White";
		kitty.paws = 4;
		kitty.tail = true;
		kitty.fur = "rrrr";
		
		kitty.eat();
		kitty.purr();
		kitty.play();
		kitty.sleep();
		

	}
}
