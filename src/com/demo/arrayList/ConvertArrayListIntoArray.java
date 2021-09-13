package com.demo.arrayList;

import java.util.ArrayList;

public class ConvertArrayListIntoArray {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Green");
		color.add("Yellow");
		color.add("Voilet");
		color.add("Pink");
		color.add("Black");
		color.add("White");
		System.out.println(color);

		String arr[] = new String[color.size()];
		color.toArray(arr);
		for (String i : arr) {
			System.out.println(i);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Elements at " + i + " index is " + arr[i]);
		}

	}

}
