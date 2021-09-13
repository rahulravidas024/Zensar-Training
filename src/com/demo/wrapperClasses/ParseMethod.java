package com.demo.wrapperClasses;

public class ParseMethod {

	public static void main(String[] args) {
		String str = "-10";
		int value1 = Byte.parseByte(str);
		System.out.println(value1);

		int i = Integer.parseInt("658");
		System.out.println(i);

		short s = Short.parseShort("7");
		System.out.println(s);

		float f = Float.parseFloat("435");
		System.out.println(f);

		double d = Double.parseDouble("34724");
		System.out.println(d);
	}

}
