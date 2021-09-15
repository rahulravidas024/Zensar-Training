package com.demo.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student1MainClass {

	public static void main(String[] args) {
		ArrayList<Student1> list = new ArrayList<>();
		list.add(new Student1(101, "Rahul", 22));
		list.add(new Student1(106, "Anil", 25));
		list.add(new Student1(104, "Shivmurat", 29));
		list.add(new Student1(102, "Shubham", 21));
		list.add(new Student1(108, "Vinay", 20));
		Collections.sort(list, new Student1());
		Iterator<Student1> itr = list.iterator();
		while (itr.hasNext()) {
			Student1 s = itr.next();
			System.out.println(s);
		}

	}

}
