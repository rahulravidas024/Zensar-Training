package com.demo.loops;

public class PrimeBetween400to300 {

	public static void main(String[] args) {
		int i, j, count;
		System.out.println("Prime numbers between 400 to 300 are: ");
		for (i = 400; i >= 300; i--) {
			count = 0;
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2)
				System.out.println(i);
		}
	}

}
