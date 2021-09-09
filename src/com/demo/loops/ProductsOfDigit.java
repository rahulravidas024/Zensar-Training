package com.demo.loops;

import java.util.Scanner;

public class ProductsOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int i, mul = 1;
		while (num != 0) {
			i = num % 10;
			mul = mul * i;
			num = num / 10;
		}
		System.out.println("Product of Digit is: " + mul);
		sc.close();
	}

}
