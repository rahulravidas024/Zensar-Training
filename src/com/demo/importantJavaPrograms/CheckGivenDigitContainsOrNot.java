package com.demo.importantJavaPrograms;

import java.util.Scanner;

public class CheckGivenDigitContainsOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		System.out.println("Enter Digit: ");
		int digit = sc.nextInt();

		if (num > 0) {
			while (num != 0) {
				if (num % 10 == digit) {
					System.out.println(num + " contains " + digit);
					break;
				}
				num /= 10;
			}
			System.out.println(num + " contains " + digit);
			System.out.println("Digit not contains");
		} else {
			System.out.println("Given Number is Negative");
		}

		sc.close();

	}

}
