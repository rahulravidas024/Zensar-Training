package com.demo.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class CountTwoDigitNumber {
	ArrayList<Integer> in = new ArrayList<Integer>();
	int count = 0;
	int twoDigitCount = 0;

	public void checkTwoDigitNumber() {
		Iterator<Integer> itr = in.iterator();
		while (itr.hasNext()) {
			Integer num = itr.next();
			System.out.println(num);
			// if(num>=10 && num<=99)
			// count++;
			int count = 0;
			while (num != 0) {
				num /= 10;
				count++;
			}
			if (count == 2) {
				twoDigitCount++;
			}
		}
	}

	public void makeList() {
		in.add(11);
		in.add(2);
		in.add(43);
		in.add(94);
		in.add(5);
		checkTwoDigitNumber();
	}

	public void displayList() {
		// System.out.println("Array: " + in);
		// System.out.println("Total two digit number: " + count);
		System.out.println("Total two digit number: " + twoDigitCount);
	}

	public static void main(String[] args) {
		CountTwoDigitNumber obj = new CountTwoDigitNumber();
		obj.makeList();
		obj.displayList();

	}

}
