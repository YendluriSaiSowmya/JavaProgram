package com.dest.basics.javaprogram;

public class StringCode4 {

	public static void main(String[] args) {
		String s1 = new String("rama");
		String s2 = new String( "rama");
		if(s1.equalsIgnoreCase(s2)==true) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");	
		}
		System.out.println("==========================");
		if(s1==s2) {
			System.out.println("Address are equal");
		}
		else {
			System.out.println("Address are not equal");
		}
	}

}
