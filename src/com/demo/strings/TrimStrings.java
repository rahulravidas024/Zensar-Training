package com.demo.strings;

public class TrimStrings {

	public static void main(String[] args) {
		String str = "                            Java Training";
		String newstr = str.trim();
		System.out.println("Original String: " + str);
		System.out.println("New String: " + newstr);
	}
}
