package com.syntax.class25;

public class TestClass {
	public static void main(String[] args) {
		SuperClass c = new SubClass();
		c.enjoy();// static method from parent class get executed, enjoy from child class will be hidden

		SuperClass.enjoy();
		SubClass.enjoy();// cannot parent static method, only your static
	}
}
