package com.demo.arrayList;

import java.util.ArrayList;

public class PrintUsingForLoop {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(33);
		list.add(43);
		list.add(53);
		list.add(63);
		System.out.println("Array: " + list);
		System.out.println("Print Using For Loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
