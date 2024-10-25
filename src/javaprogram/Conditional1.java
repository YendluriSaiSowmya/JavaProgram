package com.dest.basics.javaprogram;

import java.util.Scanner;

public class Conditional1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the byte value:");
		byte b = sc.nextByte();
		System.out.println("The byte value:"+b);
		System.out.println("Enter the long value:");
		long l = sc.nextLong();
		System.out.println("The long value:"+l);
		System.out.println("Enter the short value:");
		short s = sc.nextShort();
		System.out.println("The short value:"+s);
		System.out.println("Enter the integer:");
		int i = sc.nextInt();
		System.out.println("The int value:"+i);
		System.out.println("Enter the float value:");
		float f = sc.nextFloat();
		System.out.println("The float value:"+f);
		System.out.println("Enter the String value:");
		String str = sc.next();
		System.out.println("The string value:"+str);
		String str1 = sc.nextLine();
		System.out.println("The string value:"+str1);
	}

}
