package com.syntax.class30;

public abstract class Insurance {
	public String insuranceName;

	public Insurance(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public abstract void getQuote();

	public abstract void cancelInsurance();
}

class Car extends Insurance {
	public String carModel;

	public Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel = carModel;
	}

	public void getQuote() {
		System.out.println(carModel + " can have any type of insurance");
	}

	public void cancelInsurance() {
		System.out.println("If you have " + carModel + " you cannot cancel your insurance");
	}

}

class Pet extends Insurance {
	public String petType;

	public Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;
	}

	public void getQuote() {
		System.out.println(petType + " can have any type of insurance");
	}

	public void cancelInsurance() {
		System.out.println("If you have " + petType + " you can cancel your insurance but think twice before");
	}

}

class Health extends Insurance {
	public String petType;

	public Health(String insuranceName) {
		super(insuranceName);

	}

	public void getQuote() {
		System.out.println(insuranceName + " can have any type of insurance");
	}

	public void cancelInsurance() {
		System.out.println("If you have " + insuranceName + " you can cancel your insurance but think twice before");
	}

}
