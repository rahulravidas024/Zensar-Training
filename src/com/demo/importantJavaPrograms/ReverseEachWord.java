package com.demo.importantJavaPrograms;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				s = str.charAt(i) + s;
			}

			else {
				System.out.print(s + " ");
				s = "";
			}
		}
		System.out.print(s);
		sc.close();
	}

}
