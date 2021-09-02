package loops;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int i = 1;
		do {
			System.out.println(num * i);
			i++;
		} while (i <= 10);
	}

}
