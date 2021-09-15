package com.demo.comparable;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeCustomArrayList {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("Anil", "HR", 25));
		list.add(new Employee("Shivmurat", "Management", 22));
		list.add(new Employee("Shubham", "Accounting", 24));
		list.add(new Employee("Vinay", "Finance", 21));
		list.add(new Employee("Sunny", "Doctor", 26));
		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
			Employee e = itr.next();
			System.out.println(e);
		}
	}

}
