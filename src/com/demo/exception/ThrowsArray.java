package com.demo.exception;

import java.util.Scanner;

public class ThrowsArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total elements number: ");
		int num = sc.nextInt();
		System.out.println("Enter the Elements of Array: ");
		int arr[] = new int[num];
		try {
			for (int i = 0; i <= num; i++) {
				arr[i] = sc.nextInt();
			}
		} catch (Exception e) {
			System.out.println("exception handled");
			System.out.println("Array Index is Greater");
		}
		System.out.println("Array Elements are: ");
		for (int i = 0; i < num; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
