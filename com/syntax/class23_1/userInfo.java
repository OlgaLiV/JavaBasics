package com.syntax.class23_1;

public class userInfo extends userClass {
	String userAdress;

	public userInfo(String name, String mobileNumber, String userAdress) {
		super(name, mobileNumber);
		this.userAdress = userAdress;
	}

	public void userDetails() {
		System.out.println(name + " " + mobileNumber + " " + userAdress);
	}
}
