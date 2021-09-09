package array;

import java.util.Scanner;

public class FrequencyOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total number of element: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Array Elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int fr[] = new int[arr.length];
		int visited = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					fr[j] = visited;
				}
			}
			if (fr[i] != visited)
				fr[i] = count;
		}
		System.out.println("---------------------------------------");
		System.out.println(" Element | Frequency");
		System.out.println("---------------------------------------");
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited)
				System.out.println("    " + arr[i] + "    |    " + fr[i]);
		}
		System.out.println("----------------------------------------");
		sc.close();
	}

}
