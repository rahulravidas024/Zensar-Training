package com.demo.arrayList;

import java.util.ArrayList;

public class SomeMethodsExample {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(45);
		list1.add(35);
		list1.add(67);
		list1.add(487);
		list1.add(175);
		System.out.println("ArrayList: " + list1);

		list1.add(567);
		System.out.println("After Adding");
		System.out.println("ArrayList: " + list1);

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.addAll(list1);
		System.out.println("After Adding All Elements In List 2");
		System.out.println("ArrayList: " + list2);

		list2.remove(0);
		System.out.println("After Remove");
		System.out.println("ArrayList: " + list2);

		list2.removeAll(list2);
		System.out.println("After Removing All Elements");
		System.out.println("ArrayList: " + list2);

		ArrayList<Integer> list3 = new ArrayList<>();
		list3.addAll(list1);
		list3.add(3467);
		list3.add(32);
		list3.add(123);
		System.out.println("ArrayList: " + list3);

		list3.retainAll(list1);
		System.out.println("All Retain Elements from List 1");
		System.out.println("ArrayList: " + list3);

		System.out.println("Size of List 3: " + list3.size());
		System.out.println("Empty List: " + list3.isEmpty());
		System.out.println("Index of 35 is: " + list3.indexOf(35));
		System.out.println("Contains 45 or not: " + list3.contains(45));

	}

}
