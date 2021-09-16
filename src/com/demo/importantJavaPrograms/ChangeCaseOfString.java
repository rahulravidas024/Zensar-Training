package com.demo.importantJavaPrograms;

import java.util.Scanner;

public class ChangeCaseOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		char c[] = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (Character.isUpperCase(c[i])) {
				c[i] = Character.toLowerCase(c[i]);
			} else {
				c[i] = Character.toUpperCase(c[i]);
			}
		}
		System.out.println(c);
		sc.close();
	}

}
