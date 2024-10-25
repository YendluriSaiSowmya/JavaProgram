package com.dest.basics.javaprogram;

public class Unary {

	public static void main(String[] args) {
		int a = 37;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println("-----------");
		
		int a1 = 37;
		int b1 = ++a1;
		System.out.println(a1);
		System.out.println(b1);
		System.out.println("------------");
		
		int a2 = 42;
		int b2 = a2++ + a2++;
		System.out.println(a2);
		System.out.println(b2);
				
		

	}

}
