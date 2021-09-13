package com.demo.arrayList;

import java.util.ArrayList;

public class ReplaceElementsInArrayList {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Green");
		color.add("Yellow");
		color.add("Voilet");
		color.add("Pink");
		color.add("Black");
		color.add("White");
		System.out.println("Before Replace the ArrayList is: ");
		System.out.println(color);

		color.set(0, "DarkRed");
		color.set(1, "DarkGreen");
		color.set(2, "DarkYellow");
		System.out.println("After Replace the ArrayList is: ");
		System.out.println(color);
	}

}
