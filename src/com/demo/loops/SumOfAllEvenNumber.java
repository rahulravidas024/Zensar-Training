package com.demo.loops;

import java.util.Scanner;

public class SumOfAllEvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Number: ");
		int num = sc.nextInt();
		int i, sum = 0;
		for (i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}

		}
		System.out.println("Sum Of All Even Number is: " + sum);
		sc.close();
	}

}
