package com.demo.conditionalStatements;

import java.util.Scanner;

public class ThreeDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Three Digit Number: ");
		int num = sc.nextInt();
		if (num > 99 && num < 1000) {
			System.out.println("The Number is Three Digit");
			int lastDigit = num % 10;
			int firstDigit = num / 100;
			int sum = lastDigit + firstDigit;
			System.out.println("Sum of 1st and 3rd digit is: " + sum);
		} else {
			System.out.println("The Number is Not Three Digit");
		}
		sc.close();
	}

}
