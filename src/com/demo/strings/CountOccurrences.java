package com.demo.strings;

import java.util.Scanner;

public class CountOccurrences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		System.out.println("Enter the Character to Find: ");
		char search = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == search)
				count++;
		}
		System.out.println("The Character " + search + " appears " + count + " times");
		sc.close();
	}
}
