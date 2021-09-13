package com.demo.array;

import java.util.Scanner;

public class SingleDimensionalArray {
	int arr[] = new int[5];
	Scanner sc = new Scanner(System.in);

	public void getArrayElements() {
		System.out.println("Enter 5 Array Elements: ");
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
	}

	public void displayArrayElements() {
		System.out.println("Array Elements are: ");
		for (int value : arr) {
			System.out.print(value + " ");
		}
	}

	public static void main(String[] args) {
		SingleDimensionalArray obj = new SingleDimensionalArray();
		obj.getArrayElements();
		obj.displayArrayElements();

	}

}
