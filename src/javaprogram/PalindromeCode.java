package com.dest.basics.javaprogram;

import java.util.Scanner;

public class PalindromeCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  the string:");
		String s1 = sc.next();
		String s2 = "";
		for(int i=s1.length()-1;i>=0;i--) {
			s2 = s2 + s1.charAt(i);
		}
		if(s1.equals(s2)==true) {
			System.out.println("Given string is palindrome");
		}
		else {
			System.out.println("Given string is not a palindrome:"+" "+s2);
		}
	}

}



