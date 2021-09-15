package com.demo.comparable;

public class Employee2 implements Comparable<Employee2> {
	String name;
	String designation;
	int age;

	public Employee2() {

	}

	public Employee2(String n, String d, int a) {
		name = n;
		designation = d;
		age = a;
	}

	@Override
	public String toString() {
		return "Name=" + name + ",Designation=" + designation + ", Age=" + age;
	}

	@Override
	public int compareTo(Employee2 o) {
		if (age == o.age)
			return 0;
		else if (age >= o.age)
			return 1;
		else
			return -1;
	}

}
