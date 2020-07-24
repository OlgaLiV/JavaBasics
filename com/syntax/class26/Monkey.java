package com.syntax.class26;

public abstract class Monkey { // 0% abstraction
	public void jumps() {
		System.out.println("Monkey jumps");
	}
}

abstract class Mouse {
	public void run() {
		System.out.println("All mouses can run");
	}

	public abstract void eat();
}

abstract class Human { // 100% abstraction
	public abstract void eat();

	public abstract void work();

	public abstract void sleep();
}