package loops;

import java.util.Scanner;

public class KrishnamurthyProgram {

	static int factorial(int number) {
		int fact = 1;
		while (number != 0) {
			fact = fact * number;
			number--;
		}
		return fact;
	}

	static boolean checkNumber(int number) {
		int sum = 0;
		int temp = number;
		while (temp != 0) {
			sum = sum + factorial(temp % 10);
			temp = temp / 10;
		}
		if (sum == number)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = sc.nextInt();
		if (checkNumber(num))
			System.out.println(num + " is a krishnamurthy number");
		else
			System.out.println(num + " is not a krishnamurthy number");
		sc.close();
	}

}
