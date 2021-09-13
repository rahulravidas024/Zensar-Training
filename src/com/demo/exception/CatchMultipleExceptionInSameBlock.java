package com.demo.exception;

import java.util.Arrays;
import java.util.Scanner;

public class CatchMultipleExceptionInSameBlock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 10, 20, 30, 2, 0, 8 };
		System.out.println("Enter position which you want to divide(0 to 5): ");
		System.out.println("Array: " + Arrays.toString(arr));
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			int result = (arr[a]) / (arr[b]);
			System.out.println("Result of " + arr[a] + "/" + arr[b] + ": " + result);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException exp) {
			System.out.println("Warning: Enter inputs as per instructions ");
			sc.close();
		}
	}
}
