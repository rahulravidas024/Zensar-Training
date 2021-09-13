package com.demo.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElementsInArrayList {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Green");
		color.add("Yellow");
		color.add("Voilet");
		color.add("Pink");
		color.add("Black");
		color.add("White");
		System.out.println("Before Swap the ArrayList is: ");
		System.out.println(color);

		Collections.swap(color, 0, 1);
		Collections.swap(color, 2, 3);
		Collections.swap(color, 4, 5);
		System.out.println("After Swap the ArrayList is: ");
		System.out.println(color);

	}

}
