package com.demo.strings;

public class AllStringsFunctions {
	public static void main(String[] args) {
		String str1 = "Zensar";
		char ch[] = { 'T', 'r', 'a', 'i', 'n', 'i', 'n', 'g', };
		String str2 = new String(ch);
		String str3 = new String("Java");
		String str4 = str3;
		String str5 = new String("Zensar");
		String str6 = str1 + str2 + str3;
		System.out.println("String1: " + str1);
		System.out.println("String2: " + str2);
		System.out.println("String3: " + str3);
		System.out.println("String4: " + str4);
		System.out.println("String5: " + str5);
		System.out.println("String6: " + str6);
		System.out.println("String Length is: " + str1.length());
		System.out.println("String in UpperCase: " + str1.toUpperCase());
		System.out.println("String in LowerCase: " + str1.toLowerCase());
		System.out.println("String in 2nd index: " + str1.charAt(2));
		System.out.println("String str1 Compare to String str3: " + str1.compareTo(str3));
		System.out.println("String Concat: " + str1.concat(str2).concat(str3));
		System.out.println("String SubString at 2nd Index: " + str1.substring(2));
		System.out.println("String SubString at 2nd Index to 5th Index: " + str1.substring(2, 5));
		System.out.println("String HashCode: " + str1.hashCode());
		System.out.println("String Index Of: " + str1.indexOf(2));
		System.out.println("String HashCode: " + str1.indexOf(str3));
		System.out.println("String Empty or not: " + str1.isEmpty());
		System.out.println("String str1 is equal to str3: " + str1.equals(str3));
		System.out.println("String str1 is equal to str5: " + str1.equals(str5));
		System.out.println("String str1 is equal to str5: " + (str1 == str5));
		System.out.println("String str3 is equal to str4: " + str3.equals(str4));
		System.out.println("String Split: " + str1.split(str3));
		System.out.println("String Trim: " + str6.trim());
	}

}
