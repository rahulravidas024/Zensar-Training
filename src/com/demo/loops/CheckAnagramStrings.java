package com.demo.loops;

import java.util.Arrays;

public class CheckAnagramStrings {

	static void isAnagram(String str1, String str2) {
		String s1 = str1.replaceAll("\\s", "");
		System.out.println("String1 is: " + s1);
		String s2 = str2.replaceAll("\\s", "");
		System.out.println("String2 is: " + s2);
		boolean status = true;
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			char arr1[] = s1.toLowerCase().toCharArray();
//			System.out.println(arr1);
			char arr2[] = s2.toLowerCase().toCharArray();
//			System.out.println(arr2);
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			status = Arrays.equals(arr1, arr2);
		}
		if (status) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}

	public static void main(String[] args) {
		isAnagram("Keep", "Peek");

	}

}
