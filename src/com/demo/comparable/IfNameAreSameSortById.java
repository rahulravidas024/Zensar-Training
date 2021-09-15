package com.demo.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IfNameAreSameSortById {

	public static void main(String[] args) {
		ArrayList<Employee3> list = new ArrayList<>();
		list.add(new Employee3("Anil", "CEO", 25));
		list.add(new Employee3("Shivmurat", "Management", 22));
		list.add(new Employee3("Shubham", "Accounting", 24));
		list.add(new Employee3("Vinay", "Finance", 21));
		list.add(new Employee3("Sunny", "Doctor", 26));
		list.add(new Employee3("Shivmurat", "CEO", 24));
		list.add(new Employee3("Shubham", "Engineer", 28));
		Collections.sort(list);
		Iterator<Employee3> itr = list.iterator();
		while (itr.hasNext()) {
			Employee3 e = itr.next();
			System.out.println(e);
		}

	}

}
