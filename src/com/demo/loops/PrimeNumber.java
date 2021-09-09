package com.demo.loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int i=2, count = 0;
		while(i <= num/2) {
			if (num % i == 0)
			{
				count++;
				break;
			}
				i++;
		}
		if (count == 0)
			System.out.println("This is a Prime Number.");
		else
			System.out.println("This is not a Prime Number.");
		sc.close();
		}
	}

