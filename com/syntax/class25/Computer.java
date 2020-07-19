package com.syntax.class25;

public class Computer {

	String name, model;
	double size;

	public Computer(String name, String model, int size) {
		this.name = name;
		this.model = model;
		this.size = size;
	}

	public void internetConnection() {
		System.out.println(name + " " + model + "can have an internet connection");
	}

	public void haveOS() {
		System.out.println(name + " " + model + " has Windows");
	}

	public void haveBigScreen() {
		System.out.println(name + " " + model + " has a big screen = " + size);

	}
}

	class Apple extends Computer {
		public Apple(String name, String model, int size) {
			super(name, model, size);
		}

		public void haveOS() {
			System.out.println(name + " " + model + " has MacOS");
		}

		public void costMuch() {
			System.out.println(name + " " + model + " is expencive");
		}

		public void haveBigScreen() {
			System.out.println(name + " " + model + " has a Retina screen size = " + size);

		}
	}



class Lenovo extends Computer {
	public Lenovo(String name, String model, int size) {
		super(name, model, size);
	}

	public void playGames() {
		System.out.println("On " + name + " " + model + " you can play");
	}

	public void internetConnection() {
		System.out.println(name + " " + model + "can have an internet connection but it is not stable");
	}

	public void haveBigScreen() {
		System.out.println(name + " " + model + " has a little screen = " + size);

	}
}

class HP extends Computer {
	public HP(String name, String model, int size) {
		super(name, model, size);
	}

	public void canWork() {
		System.out.println(name + " " + model + " the best for work");
	}

	public void haveBigScreen() {
		System.out.println(name + " " + model + " has a huge screen size = " + size);

	}
}

class Dell extends Computer {
	public Dell(String name, String model, int size) {
		super(name, model, size);
	}

	public void neverSeenItBefore() {
		System.out.println(name + " " + model + " unknown");
	}

	public void haveBigScreen() {
		System.out.println(name + " " + model + " has no screen");

	}
}
