package com.demo.arrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class PrintInReverseOrder {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(45);
		list.add(35);
		list.add(67);
		list.add(487);
		list.add(175);
		System.out.println("ArrayList of Integer: " + list);
		
		System.out.println("After Reverse: ");
		ListIterator<Integer> itr = list.listIterator(list.size());
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
