package com.demo.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Player {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Sachin");
		list.add("Dhoni");
		list.add("Virat");
		list.add("Chahal");
		list.add("KapilDev");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			String s = itr.next();
			System.out.println("Player Names: " + s);
		}
		System.out.println("After Sorting: ");
		Collections.sort(list);
		Iterator<String> itr1 = list.iterator();
		while(itr1.hasNext())
		{
			String s1 = itr1.next();
			System.out.println("Player Names: " + s1);
		}
	}

}
