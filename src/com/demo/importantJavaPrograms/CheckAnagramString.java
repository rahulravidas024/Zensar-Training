package com.demo.importantJavaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagramString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String: ");
		String s1 = sc.nextLine();
		System.out.println("Enter Second String: ");
		String s2 = sc.nextLine();
		if (s1.length() == s2.length()) {
			char arr1[] = s1.toLowerCase().toCharArray();
			char arr2[] = s2.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2))
				System.out.println(s1 + " and " + s2 + " are Anagram");
			else
				System.out.println("Given Strings are not Anagram");
		} else {
			System.out.println("Given Strings are not Anagram");
		}
		sc.close();
	}

}
