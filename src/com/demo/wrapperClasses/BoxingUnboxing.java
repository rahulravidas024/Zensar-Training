package com.demo.wrapperClasses;

public class BoxingUnboxing {

	public static void main(String[] args) {
		int a = 100;
		Integer a2 = new Integer(a); // Boxing
		Integer a3 = Integer.valueOf(a); // Boxing
		Integer a4 = a; // Autoboxing
		System.out.println(a);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		Integer a5 = new Integer("50");
		System.out.println(a + a5);
		int a6 = a2.intValue(); // UnBoxing
		System.out.println(a6);

		byte b = 10;
		short s = 20;
		long l = 40;
		float f = 50.0F;
		double d = 60.0D;
		char c = 'a';
		boolean b2 = true;

		Byte byteobj = new Byte(b);
		Short shortobj = new Short(s);
		Long longobj = new Long(l);
		Float floatobj = new Float(f);
		Double doubleobj = new Double(d);
		Character charobj = new Character(c);
		Boolean boolobj = new Boolean(b2);

		System.out.println("\nBoxing");
		System.out.println("---------------------------------");
		System.out.println("Byte object: " + byteobj);
		System.out.println("Short object: " + shortobj);
		System.out.println("Long object: " + longobj);
		System.out.println("Float object: " + floatobj);
		System.out.println("Double object: " + doubleobj);
		System.out.println("Character object: " + charobj);
		System.out.println("Boolean object: " + boolobj);

		byte bytevalue = byteobj;
		short shortvalue = shortobj;
		long longvalue = longobj;
		float floatvalue = floatobj;
		double doublevalue = doubleobj;
		char charvalue = charobj;
		boolean boolvalue = boolobj;

		System.out.println("\nUnboxing");
		System.out.println("---------------------------------");
		System.out.println("byte value: " + bytevalue);
		System.out.println("short value: " + shortvalue);
		System.out.println("long value: " + longvalue);
		System.out.println("float value: " + floatvalue);
		System.out.println("double value: " + doublevalue);
		System.out.println("char value: " + charvalue);
		System.out.println("boolean value: " + boolvalue);
	}

}
