package com.dest.basics.javaprogram;

import java.util.Scanner;

public class launch7 {

	public static void main(String[] args) {
		try {
			Scanner  sc = new Scanner(System.in);
			System.out.println("Division operation started");
			System.out.println("Enter the num-1: ");
			int num1 = sc.nextInt();
			System.out.println("Enter the num-2: ");
			int num2 = sc.nextInt();
			int res = num1/num2;
			System.out.println(res);
			System.out.println("Division operation is completed");
			
			System.out.println("Array operation started");
			System.out.println("enter the array size: ");
			int n = sc.nextInt(); //cs
			int arr[] = new int[n]; //cs
			
			System.out.println("Enter the positon to insert value: ");
			int pos = sc.nextInt(); //cs
			System.out.println("Enter the value: ");
			int val = sc.nextInt(); //cs
			
			arr[pos] = val; //cs
			
			System.out.println("Data added");
			System.out.println("Array operation is completed");
			
		}
		catch (Exception e) // genric catch block
		{
			System.out.println("Exception occured in main is handled");
		}
			
		
		
	}

}
