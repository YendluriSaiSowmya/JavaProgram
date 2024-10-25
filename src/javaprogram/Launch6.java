package com.dest.basics.javaprogram;

import java.util.Scanner;

public class Launch6 {
	public static void main(String[] args) {
		try {
			Scanner  sc = new Scanner(System.in);
			System.out.println("Enter the num-1: ");
			int num1 = sc.nextInt();
			System.out.println("Enter the num-2: ");
			int num2 = sc.nextInt();
			int res = num1/num2;
			System.out.println(res);
		}
		catch (ArithmeticException ae) //generic catch block
		{
			System.out.println("Exception occured in main is handled");
		}
				
	}

}
