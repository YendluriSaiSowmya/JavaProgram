package com.dest.basics.javaprogram;

import java.util.Scanner;

class ArrayOperation2{
	int arr[];
	int size;
	Scanner sc = new Scanner(System.in);
	void CreateArray() {
		System.out.println("Array Creation is Started");
		System.out.println("Enter the no of purchases:");
		size = sc.nextInt();
		System.out.println("Array is Created");
		System.out.println("=========================");
	}
	void addData() {
		System.out.println("Collecting the things:");
		for(int i=0;i<size;i++) {
			System.out.println("Enter the cost of things:"+(i+1));
			arr[i] = sc.nextInt();
	
		}
		System.out.println("The data is collected");
		System.out.println("==========================");
	}
	void calculateTotalExpenses() {
		for(int i=0;i<size;i++) {
			sum = sum + arr[i];
		}
		System.out.println("Total expenses incured is:"+sum);
		
	}
}

public class Program1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
