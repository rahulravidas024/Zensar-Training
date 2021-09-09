package loops;

import java.util.Scanner;

public class FrequencyOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		int digit[] = new int[10];
		int r, i;
		while (num > 0) {
			r = num % 10;
			for (i = 0; i <= 9; i++) {
				if (r == i) {
					digit[i]++;
				}
			}
			num = num / 10;
		}
		for (i = 0; i <= 9; i++) {
			if (digit[i] != 0) {
				System.out.println("Frequency of " + i + " is: " + digit[i]);
			}
		}
		sc.close();
	}

}
