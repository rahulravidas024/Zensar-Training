package switchStatements;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		switch (num % 2) {
		case 0:
			System.out.println("Number is EVEN");
			break;
		case 1:
			System.out.println("Number is ODD");
			break;
		}
	}

}
