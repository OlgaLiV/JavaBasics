package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {
	public static void main(String[] args) {
		ArrayList<Insurance> insurance = new ArrayList<>();
		insurance.add(new Car("Geico", "Audi"));
		insurance.add(new Pet("QQQ", "Dog"));
		insurance.add(new Health("Health"));

		System.out.println("============Using regular For loop=============");

		for (Insurance in : insurance) {
			in.getQuote();
			in.cancelInsurance();
		}

		System.out.println("===========Using Enhanced For loop==============");

		for (int i = 0; i < insurance.size(); i++) {
			insurance.get(i).getQuote();
			insurance.get(i).cancelInsurance();
		}

		System.out.println("============Using Iterator=============");

		Iterator<Insurance> it = insurance.iterator();
		while (it.hasNext()) {
			Insurance in = it.next();
			in.getQuote();
			in.cancelInsurance();
		}

	}
}
