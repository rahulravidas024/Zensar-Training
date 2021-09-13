package com.demo.arrayList;

import java.util.ArrayList;

public class PrintByCollections {

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
		for(String s: color)
		{
			System.out.println(s);
		}

	}

}
