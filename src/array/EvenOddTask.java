package array;

import java.util.Scanner;

public class EvenOddTask {
	int arr[] = new int[5];
	int sum = 0;
	Scanner sc = new Scanner(System.in);

	public void getArrayElements() {
		System.out.println("Enter Array Elements: ");
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
	}

	public void displayArrayElements() {
		System.out.println("Array Elements are: ");
		// for (int i = 0; i < arr.length; i++)
		// System.out.println(arr[i]);
		for (int value : arr) {
			System.out.println(value);
		}
	}

	public void evenArrayElements() {
		System.out.println("Even Array Elements are: ");
		for (int i = 0; i < arr.length; i++)
			if (arr[i] % 2 == 0)
				System.out.println(arr[i]);
	}

	public void oddArrayElements() {
		System.out.println("Odd Array Elements are: ");
		for (int i = 0; i < arr.length; i++)
			if (arr[i] % 2 == 1)
				System.out.println(arr[i]);
	}

	public void sumOfOddArrayElements() {
		System.out.println("Sum of Odd Array Elements are: ");
		for (int i = 0; i < arr.length; i++)
			if (arr[i] % 2 == 1)
				sum = sum + arr[i];
		System.out.println(sum);
	}

	public void oddPositionArrayElements() {
		System.out.println("Odd Position Array Elements are: ");
		for (int i = 0; i < arr.length; i = i + 2)
			System.out.println(arr[i]);

	}

	public static void main(String[] args) {
		EvenOddTask obj = new EvenOddTask();
		obj.getArrayElements();
		obj.displayArrayElements();
		obj.evenArrayElements();
		obj.oddArrayElements();
		obj.sumOfOddArrayElements();
		obj.oddPositionArrayElements();
	}

}
