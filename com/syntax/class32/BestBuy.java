package com.syntax.class32;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BestBuy {
	public static void main(String[] args) {

//		Create a map of Best Buy store. Place
//		item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//		Retrieve all keys and values from a Best Buy map using EntrySet.

		Map<Integer, String> storeBB = new HashMap<>();
		storeBB.put(7664847, "Printer");
		storeBB.put(7879885, "TV");
		storeBB.put(7767837, "Camera");
		storeBB.put(5749352, "Scanner");
		storeBB.put(6395642, "MP3 Player");

		Set<Entry<Integer, String>> entries = storeBB.entrySet();
		Iterator<Entry<Integer, String>> it = entries.iterator();
		while (it.hasNext()) {
			Entry<Integer, String> ent = it.next();
			System.out.println(ent.getKey() + " --- " + ent.getValue());
		}

	}
}
