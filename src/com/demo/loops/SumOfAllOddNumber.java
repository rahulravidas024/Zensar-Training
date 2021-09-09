package com.demo.loops;

import java.util.Scanner;

public class SumOfAllOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N Number: ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
			}
		}
		System.out.println("Sum Of All Odd Number is: " + sum);
		sc.close();
	}

}
