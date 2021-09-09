package com.demo.loops;

import java.util.Scanner;

public class FindGCDorHCF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int num2 = sc.nextInt();
		int hcf = 0;
		for (int i = 1; i <= num1 || i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				hcf = i;
		}
		System.out.println("HCF or GCD of " + num1 + " and " + num2 + " is: " + hcf);
		sc.close();
	}

}
