package com.demo.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortInDescendingOrder {

	public static void main(String[] args) {
		ArrayList<Employee2> list = new ArrayList<>();
		list.add(new Employee2("Anil", "HR", 25));
		list.add(new Employee2("Shivmurat", "Management", 22));
		list.add(new Employee2("Shubham", "Accounting", 24));
		list.add(new Employee2("Vinay", "Finance", 21));
		list.add(new Employee2("Sunny", "Doctor", 26));
		Collections.sort(list);
		Iterator<Employee2> itr = list.iterator();
		while (itr.hasNext()) {
			Employee2 e = itr.next();
			System.out.println(e);
		}

	}

}
