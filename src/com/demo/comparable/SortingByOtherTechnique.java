package com.demo.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingByOtherTechnique {

	public static void main(String[] args) {
		ArrayList<Employee1> list = new ArrayList<>();
		list.add(new Employee1("Anil", "HR", 25));
		list.add(new Employee1("Shivmurat", "Management", 22));
		list.add(new Employee1("Shubham", "Accounting", 24));
		list.add(new Employee1("Vinay", "Finance", 21));
		list.add(new Employee1("Sunny", "Doctor", 26));
		Collections.sort(list);
		Iterator<Employee1> itr = list.iterator();
		while (itr.hasNext()) {
			Employee1 e = itr.next();
			System.out.println(e);
		}

	}

}
