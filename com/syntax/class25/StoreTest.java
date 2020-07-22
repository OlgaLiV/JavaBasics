package com.syntax.class25;

public class StoreTest {
	public static void main(String[] args) {
		Store macys = new Macys("Macys", "Tysons, VA");
		Store starbucks = new Starbucks("Sturbucks", "NY");
		Store nike = new Nike("Nike", "LA", "running shoes");
		// we create all objects and representing in one variable
		Store [] myStores = {macys,starbucks,nike};
		Store[] stores = { new Macys("Macys", "FL"), new Starbucks("Sturbucks", "Texas"), new Nike("Nike", "IL","sneakers") };
		int size = stores.length;
		System.out.println(size);

		System.out.println("----ENHANCED LOOPING STORE ARRAY----");
		for (Store s : stores) {
			s.openHours();
			s.sell();
			System.out.println("------------");
		}

		System.out.println("----REGULAR LOOPING MY STORES ARRAY----");
		for (int i = 0; i < myStores.length; i++) {
			myStores[i].openHours();
			System.out.println("***************");
		}

	}
	
}
