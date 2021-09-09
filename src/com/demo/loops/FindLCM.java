package com.demo.loops;

import java.util.Scanner;

public class FindLCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int num2 = sc.nextInt();
		int gcd = 1;
		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				gcd = i;
		}
		int lcm = (num1 * num2) / gcd;
		System.out.print("LCM of a " + num1 + "and " + num2 + " is: " + lcm);
		sc.close();
	}

}
