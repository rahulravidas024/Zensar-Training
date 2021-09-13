package com.demo.arrayList;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(45);
		list.add(35);
		list.add(67);
		list.add(487);
		list.add(175);
		System.out.println("ArrayList of Integer: " + list);

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Rahul");
		list1.add("Ravidas");
		System.out.println("ArrayList of String: " + list1);

		ArrayList<Character> list2 = new ArrayList<>();
		list2.add('R');
		list2.add('A');
		list2.add('V');
		list2.add('I');
		list2.add('D');
		list2.add('A');
		list2.add('S');
		System.out.println("ArrayList of Character: " + list2);
	}

}
