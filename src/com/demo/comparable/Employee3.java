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
		int name = this.name.compareTo(o.name);
		int age = this.age-o.age;
		return (name==0) ? age : name;
	}

}
