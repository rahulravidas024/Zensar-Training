package com.demo.loops;

import java.util.Scanner;

public class SumOfFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n Number: ");
		int num = sc.nextInt();
		int i, j;
		int sum = 0;
		int fact = 1;
		for (i = 1; i <= num; i++) {
			fact = 1;
			for (j = 1; j <= i; j++) {
				fact = fact * j;
			}
			sum = sum + fact;
		}
		System.out.println("Sum is: " + sum);
		sc.close();
	}

}
