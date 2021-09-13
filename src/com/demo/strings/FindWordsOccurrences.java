package com.demo.strings;

import java.util.Scanner;

public class FindWordsOccurrences {
	static int countOccurrences(String str, String word) {
		String a[] = str.split(" ");
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (word.equals(a[i]))
				count++;
		}
		System.out.print("Total " + word + " is: ");
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		System.out.println("Enter word to find Occurrence: ");
		String word = sc.nextLine();
		System.out.println(countOccurrences(str, word));
		sc.close();
	}

}
