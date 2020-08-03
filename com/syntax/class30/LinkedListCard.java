package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCard {
	public static void main(String[] args) {

		List<Card> cards = new LinkedList<>();
		cards.add(new BankInUkraine("Maestro"));
		cards.add(new BankInGermany("Master card"));
		cards.add(new BankInUSA("Visa"));

		System.out.println("***** Access by using regular For Loop *****");
		for (int i = 0; i < cards.size(); i++) {
			cards.get(i).getCreditCard();
			cards.get(i).getDebetCard();
			cards.get(i).getBalance();
			System.out.println("===================");
		}

		System.out.println("***** Access by using Advanced For Loop *****");
		for (Card card : cards) {
			card.getCreditCard();
			card.getDebetCard();
			card.getBalance();
			System.out.println("===================");
		}

		System.out.println("***** Access by using Iterator *****");
		Iterator<Card> it = cards.iterator();
		while (it.hasNext()) {
			Card c = it.next();
			c.getCreditCard();
			c.getDebetCard();
			c.getBalance();
			System.out.println("===================");

		}

	}
}
