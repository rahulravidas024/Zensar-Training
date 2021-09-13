package com.demo.array;

import java.util.Scanner;

public class AverageArrayElement {
	int n, avg;
	int arr[] = new int[20];
	int sum = 0;
	Scanner sc = new Scanner(System.in);

	public void getArrayElements() {
		System.out.print("Enter the total number of element: ");
		n = sc.nextInt();
		System.out.println("Enter Array Elements: ");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
	}

	public void displayArrayElements() {
		for (int i = 0; i < arr.length; i++) {
			sum = (sum + arr[i]);
			avg = sum / n; 
		}
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avg);
	}

	public static void main(String[] args) {
		AverageArrayElement obj = new AverageArrayElement();
		obj.getArrayElements();
		obj.displayArrayElements();
	}

}
