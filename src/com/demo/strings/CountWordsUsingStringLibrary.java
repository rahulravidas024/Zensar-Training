package com.demo.strings;

public class CountWordsUsingStringLibrary {

	public int getString(String str) {
		String input = str;
		System.out.println(str);
		if (input == null || input.isEmpty()) {
			return 0;
		}
		String[] words = input.split("\\s+");
		System.out.println("Total words is: " + words.length);
		return words.length;
	}

	public static void main(String[] args) {
		CountWordsUsingStringLibrary obj = new CountWordsUsingStringLibrary();
		obj.getString("Hi I am Rahul Ravidas");
	}
}
