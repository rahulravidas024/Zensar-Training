package com.demo.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortStringArrayList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Rahul");
		list.add("Shivmurat");
		list.add("Anil");
		list.add("Sunny");
		list.add("Shubham");
		list.add("Vinay");
		System.out.println("Before Sorting");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("After Sorting");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}

	}

}
