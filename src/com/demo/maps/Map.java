package com.demo.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
		HashMap<String, String> m = new HashMap<>();
		m.put("101", "Amit");
		m.put("102", "Amar");
		m.put("103", "Ajay");
		m.put("104", "Raj");
		m.put("105", "Amarjeet");
		System.out.println(m);

		Set<String> k = m.keySet();
		Collection<String> v = m.values();
		System.out.println("Set of Keys: " + k);
		System.out.println("Set of Values: " + v);
		/*		
		 * Iterator<String> kitr = k.iterator(); 
		 * while (kitr.hasNext()) { 
		 * String key = kitr.next(); 
		 * String val = m.get(key); 
		 * System.out.println("Key= " + key + " " + "Value= " + val); }
		 */
		Iterator<String> vitr = v.iterator();
		while (vitr.hasNext()) {
			String s = vitr.next();
			System.out.println("Value= " + s);
		}
	}
}
