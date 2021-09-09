package com.demo.switchStatements;
import java.util.Scanner;
public class FindBiggestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int num2 = sc.nextInt();
		//int num3 = num1 > num2?1:0;
//		int number;
//		if(num1>num2)
//			number=1;
//		else
//			number = 0;
		switch(num1 > num2?1:0)
		{
		case 1:
			System.out.println(num1 + " is Greater than " + num2);
			break;
		case 0:
			System.out.println(num2 + " is Greater than " + num1);
			break;
		}
		sc.close();
	}

}
