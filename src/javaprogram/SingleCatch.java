package com.dest.basics.javaprogram;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SingleCatch {

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
		catch(ArithmeticException ae) 
		{
			System.out.println("Arithmetic Exception handled");
		}
		catch(NegativeArraySizeException ae) {
			System.out.println("Negative Array Size Exception handled");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Array Index Out Of Bounds Exception");
		}
		catch(InputMismatchException ae) {
			System.out.println("Input MisMatch Exception handled");
		}
		// generic catch block
		
		catch(Exception e) {
			System.out.println("Exception in main is handled");
		}		

	}

}

