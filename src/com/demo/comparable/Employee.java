package com.demo.comparable;

public class Employee implements Comparable<Employee> {
	String name;
	String designation;
	int age;

	public Employee() {

	}

	public Employee(String n, String d, int a) {
		name = n;
		designation = d;
		age = a;
	}

	@Override
	public String toString() {
		return "Name=" + name + ",Designation=" + designation + ", Age=" + age;
	}

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}

}
