package com.demo.importantJavaPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.LayoutFocusTraversalPolicy;

public class CountTwoDigitNumberInArrayList {

	public void checkTwoDigitNumber(ArrayList<Integer> l) {
		int oneDigitCount = 0;
		int twoDigitCount = 0;
		int threeDigitCount = 0;
		int fourDigitCount = 0;
		Iterator<Integer> itr = l.iterator();
		while (itr.hasNext()) {
			int count = 0;
			int x = itr.next();
			while (x != 0) {
				x /= 10;
				count++;
			}
			if (count == 1) {
				oneDigitCount += 1;
			}
			if (count == 2) {
				twoDigitCount = twoDigitCount + 1;
			}
			if (count == 3) {
				threeDigitCount++;
			}
			if (count == 4) {
				fourDigitCount++;
			}

		}
		// if(x>=10 && x<=99)
		// {
		// count++;
		// }
		System.out.println("Total One Digit Number is: " + oneDigitCount);
		System.out.println("Total Two Digit Number is: " + twoDigitCount);
		System.out.println("Total Three Digit Number is: " + threeDigitCount);
		System.out.println("Total Four Digit Number is: " + fourDigitCount);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		System.out.println("Enter Elements: ");
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		System.out.println(list);
		CountTwoDigitNumberInArrayList obj = new CountTwoDigitNumberInArrayList();
		obj.checkTwoDigitNumber(list);
		sc.close();
	}

}
