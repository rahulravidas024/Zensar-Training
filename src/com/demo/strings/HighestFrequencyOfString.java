package com.demo.strings;

import java.util.Arrays;

public class HighestFrequencyOfString {

	public static void main(String[] args) {
		String str = "rahul ravidas";
		System.out.println("String is: " + str);
		char tempArray[] = str.toCharArray();
		Arrays.sort(tempArray);
		String s = new String(tempArray);
		int n = s.length();
		int maxcount = 0;
		int count = 1;
		char ans = '-';
		for (int i = 1; i <= n; i++) {
			if ((i == n) || (s.charAt(i) != s.charAt(i - 1))) {
				if (maxcount < count) {
					maxcount = count;
					ans = s.charAt(i - 1);
				}
				count = 1;
			} else {
				count++;
			}
		}
		System.out.println("Maximum occurring character is: " + ans);
	}

}
