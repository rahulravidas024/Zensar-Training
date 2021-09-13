package com.demo.wrapperClasses;

public class FloatWapperClass {

	public static void main(String[] args) {
		float myFloat = 28.25f;
		Float obj1 = new Float(myFloat);
		System.out.println(obj1);
		Float obj2 = new Float("68.24");
		System.out.println(obj2);
		Float obj3 = new Float(545);
		System.out.println(obj3);
		Float obj4 = new Float(5878d);
		System.out.println(obj4);
	}

}
