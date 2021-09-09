package com.demo.loops;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number to Find Factorial: ");
		int num = sc.nextInt();
		int i, fact = 1;
		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is: " + fact);
		sc.close();
	}

}
