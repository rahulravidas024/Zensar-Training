package com.demo.comparable;

public class Employee1 implements Comparable<Employee1> {

	String name;
	String designation;
	int age;

	public Employee1() {

	}

	public Employee1(String n, String d, int a) {
		name = n;
		designation = d;
		age = a;
	}

	@Override
	public String toString() {
		return "Name=" + name + ",Designation=" + designation + ", Age=" + age;
	}

	@Override
	public int compareTo(Employee1 o) {
		if (age == o.age)
			return 0;
		else if (age >= o.age)
			return 1;
		else
			return -1;
	}

}
