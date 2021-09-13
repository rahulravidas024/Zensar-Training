package com.demo.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(33);
		list.add(43);
		list.add(53);
		list.add(63);
		System.out.println("Array: " + list);
		System.out.println("Print Using Iterator");
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer val = itr.next();
			System.out.println(val);
		}
	}
}
