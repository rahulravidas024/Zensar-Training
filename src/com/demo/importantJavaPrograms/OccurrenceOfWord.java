package com.demo.importantJavaPrograms;

import java.util.Scanner;

public class OccurrenceOfWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		System.out.println("Enter Word To Find Occurrance:  ");
		String word = sc.nextLine();
		String arr[] = s.split(" ");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (word.equals(arr[i])) {
				count++;
			}
		}
		System.out.println("Occurrance Of " + word + " is :" + count);
		sc.close();
	}

}
