package loops;

import java.util.Scanner;

public class CountVowelConsonent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String: ");
		String str = sc.nextLine().toLowerCase();
		int vcount = 0;
		int ccount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vcount++;
			} else
				ccount++;
		}
		System.out.println("Total Vowel is: " + vcount);
		System.out.println("Total Consonent is: " + ccount);
		sc.close();
	}

}
