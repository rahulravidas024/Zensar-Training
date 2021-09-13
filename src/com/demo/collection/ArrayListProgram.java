package com.demo.collection;

import java.util.ArrayList;

public class ArrayListProgram {
	ArrayList in;

	public ArrayListProgram() {
		in = new ArrayList();
	}

	public void makeList() {
		in.add("Rahul");
		in.add("Ravidas");
		in.add(22);
		in.add(123.12f);
		in.add(235.25);
		in.add("Rahul");
		in.add(22);
		System.out.println(in);
	}

	public static void main(String[] args) {

		ArrayListProgram obj = new ArrayListProgram();
		obj.makeList();
	}

}
