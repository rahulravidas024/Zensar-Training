package com.demo.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ConvertArrayIntoArrayList {

	public static void main(String[] args) {
		// Method1
		String arr[] = new String[] { "Hi", "I", "am", "Rahul" };
		ArrayList<String> l = new ArrayList<>(Arrays.asList(arr));
		System.out.println("Using Arrays.asList Method");
		System.out.println(l);

		// Method2
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list, arr);
		System.out.println("Using Collection.addAll Method");
		System.out.println(list);

	}

}
