package com.demo.wrapperClasses;

public class SomeExampleOfValueOf {

	public static void main(String[] args) {
		int a=60;
		Integer i = Integer.valueOf(a);
        Double d = Double.valueOf(10.5);
        Character c = Character.valueOf('a');
        Integer x = Integer.valueOf("654236");
        System.out.println(i);
        System.out.println(d);
        System.out.println(c);
        System.out.println(x);
        
        System.out.println(i.byteValue());
        System.out.println(i.shortValue());
        System.out.println(i.intValue());
        System.out.println(i.longValue());
        System.out.println(i.floatValue());
        System.out.println(i.doubleValue());
        
        Integer z = Integer.valueOf("1001", 5);
        System.out.println(z);
	}

}
