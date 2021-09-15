package com.demo.comparator;

import java.util.Comparator;

public class Student1 implements Comparator<Student1> {
	int rollno;
	String name;
	int age;

	public Student1() {

	}

	public Student1(int r, String n, int a) {
		rollno = r;
		name = n;
		age = a;
	}

	public String toString() {
		return "Roll no: " + rollno + "   Name: " + name + "   Age:" + age;
	}

	@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.rollno - o2.rollno;
	}

	// public int compare(Student1 o1, Student1 o2) {
	// return o1.name.compareTo(o2.name);
	// }

	// public int compare(Student1 o1, Student1 o2) {
	// return o1.age-o2.age;
	// }

}
