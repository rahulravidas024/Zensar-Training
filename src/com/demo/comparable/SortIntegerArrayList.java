package com.demo.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortIntegerArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(200);
		list.add(500);
		list.add(700);
		list.add(100);
		list.add(800);
		list.add(300);
		System.out.println("Before Sorting");
		System.out.println(list);
		Collections.sort(list);
		// Collections.sort(list, Collections.reverseOrder());
		System.out.println("After Sorting");
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer s = itr.next();
			System.out.println(s);
		}

	}

}
