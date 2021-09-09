package com.demo.loops;

import java.util.Scanner;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int count = 0;
		while (num != 0) {
			int i = num % 10;
			count++;
			num = num / 10;
		}
		System.out.println("Total Number of Digit is: " + count);
		sc.close();
	}

}
