package com.dest.basics.javaprogram;

import java.util.Scanner;

class Array3DOps{
	String arr[][];
	int size;
	Scanner sc = new Scanner(System.in);
	private int cls;
	private int stu;
	public void createArray() {
		System.out.println("Array creation Initiated...");
		System.out.println("Enter the class count:");
		cls = sc.nextInt();
		arr = new String[cls][];
		//jagged array
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the student count inside the class:"+(i+1));
			stu = sc.nextInt();
			arr[i] = new String[stu];
			
		}
		
		System.out.println("Array is Created...");
		System.out.println("==========================");
	}
	public void collectData() {
		System.out.println("collecting the data:");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside the cls:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the student marks:"+(j+1));
		        arr[i][j] =sc.next();
				}
			}
		System.out.println("data is collected:");
	}
	public void displayData() {
		System.out.println("Displaying the data:");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside the cls:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Display the name  of student" + arr[i][j]);
				
			}
		}
	}
	
}

public class Array3d {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array2DOps a = new Array2DOps();
		a.createArray();
		a.collectData();
		a.displayData();

	}

	}

