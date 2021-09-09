package com.demo.loops;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		System.out.println("Enter Power: ");
		int p = sc.nextInt();
		int result = 1;
		while (p != 0) {
			result = num * result;
			p--;
		}
		System.out.println("Result: " + result);
		sc.close();
	}

}
