package com.syntax.class13;

public class PhoneKinds {
	public static void main(String[] args) {
		Phone phone1 = new Phone();
		phone1.name = "Apple";
		phone1.model = "11 Pro";
		phone1.color = "Gold";
		phone1.memory = 256;

		System.out.println("Phone #1 is " + phone1.name + " " + phone1.model + ". It is " + phone1.color + " and "
				+ phone1.memory + " GB memory.");

		phone1.call();
		phone1.search();
		phone1.message();

		System.out.println("==========");

		Phone phone2 = new Phone();
		phone2.name = "Android";
		phone2.model = "S10";
		phone2.color = "White";
		phone2.memory = 8;

		System.out.println("Phone #2 is " + phone2.name + " " + phone2.model + ". It is " + phone2.color + " and "
				+ phone2.memory + " GB memory.");

		phone2.call();
		phone2.search();
		phone2.message();

		System.out.println("==========");

		Phone phone3 = new Phone();
		phone3.name = "Nokia";
		phone3.model = "555";
		phone3.color = "Silver";
		phone3.memory = 128;

		System.out.println("Phone #3 is " + phone3.name + " " + phone3.model + ". It is " + phone3.color + " and "
				+ phone3.memory + " GB memory.");

		phone3.call();
		phone3.search();
		phone3.message();

	}
}
