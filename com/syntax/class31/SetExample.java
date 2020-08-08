package com.syntax.class31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		HashSet<String> brand = new HashSet<>();
		brand.add("Nike");
		brand.add("Adidas");
		brand.add("H&M");
		brand.add("Zara");
		brand.add("Uniqlo");
		brand.add("Adidas");
		brand.add("H&M");
		System.out.println(brand.size());
		System.out.println(brand);

		boolean isItThere = brand.contains("Nike");
		System.out.println(isItThere);

		Iterator<String> iterator = brand.iterator();

		String obj = iterator.next();
		System.out.println(obj);

		obj = iterator.next();
		System.out.println(obj);
		System.out.println("----- Using while loop ------");
		while (iterator.hasNext()) {
			obj = iterator.next();
			System.out.println(obj);
		}
		System.out.println("----- Using for each loop ------");
		for (String br : brand) {
			System.out.println(br);
		}
		System.out.println("----- Creating objects of LinkedHashSet -----");
		LinkedHashSet<String> luxBrand = new LinkedHashSet<>();
		luxBrand.add("Prada");
		luxBrand.add("Chanel");
		luxBrand.add("Gucci");
		luxBrand.add("LV");
		luxBrand.add("Gucci");
		luxBrand.add("LV");

		System.out.println(luxBrand.size());
		System.out.println(luxBrand);

		System.out.println("----- Creating objects of TreeSet -----");

		TreeSet<String> allBrands = new TreeSet<>(brand);
		allBrands.add("Calvin Klein");
		allBrands.addAll(luxBrand);
		System.out.println(allBrands);

		System.out.println("----- Retrieving elements of TreeSet -----");
		Iterator<String> brandIterator = allBrands.iterator();
		while (brandIterator.hasNext()) {
			String br = brandIterator.next();
			System.out.println(br);
		}
		
		System.out.println("----- Creating objects of TreeSet to store Double -----");
		
		Set<Double> tset = new TreeSet<>();
		tset.add(10.99);
		tset.add(1.99);
		tset.add(1000.99);
		tset.add(10.01);
		tset.add(10.99);
		tset.add(100.99);
		
		System.out.println(tset);

	}

}
