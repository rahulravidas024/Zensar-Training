package com.demo.loops;

import java.util.Scanner;

public class PrintNPrimeNumber {

	public static void main(String[] args) {
		int i, j, count;
		System.out.print("Enter n value : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Prime numbers between 1 to " + num + " are ");
		for (i = 2; i <= num; i++) {
			count = 0;
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2)
				System.out.println(i);
		}
		sc.close();
	}

}
