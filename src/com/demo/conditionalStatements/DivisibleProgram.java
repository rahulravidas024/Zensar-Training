package com.demo.conditionalStatements;

import java.util.Scanner;

public class DivisibleProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		if (num % 5 == 0)
			System.out.println("Number is divisible by 5");
		else if (num % 11 == 0)
			System.out.println("Number is divisible by 11");
		else
			System.out.println("Number is not divisible by both 5 and 11");
		sc.close();
	}

}
