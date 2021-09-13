package com.demo.strings;

import java.util.Scanner;

public class FindFirstOccurrence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, flag = 0;
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		System.out.println("Enter the Character to Find: ");
		char ch = sc.next().charAt(0);
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				flag++;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Character Not Found ");
		} else {
			System.out.println("Character " + ch + " is at " + i + " Position");
			sc.close();
		}
	}
}
