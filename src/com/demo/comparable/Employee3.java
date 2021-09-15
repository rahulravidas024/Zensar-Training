package com.demo.comparable;

public class Employee3 implements Comparable<Employee3> {
	String name;
	String designation;
	int age;

	public Employee3() {

	}

	public Employee3(String n, String d, int a) {
		name = n;
		designation = d;
		age = a;

	}

	@Override
	public String toString() {
		return "Name=" + name + ",Designation=" + designation + ", Age=" + age;
	}

	@Override
	public int compareTo(Employee3 o) {
		if (name.equals(o.name)) {
			return age - o.age;
		} else {
			return name.compareTo(o.name);
		}
	}

}
