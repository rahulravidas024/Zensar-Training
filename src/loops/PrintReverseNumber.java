package loops;

import java.util.Scanner;

public class PrintReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		for (int i = num; i >= 1; i--)
			System.out.println(i);
		sc.close();
	}

}
