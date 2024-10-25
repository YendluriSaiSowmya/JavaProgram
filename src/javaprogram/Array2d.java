package com.dest.basics.javaprogram;

import java.util.Scanner;

class Array2DOps{
	String arr[][][];
	int size;
	Scanner sc = new Scanner(System.in);
	private int clg;
	private int cls;
	private int stu;
	public void createArray() {
		System.out.println("Array creation Initiated...");
		System.out.println("Enter the College Count:");
		clg = sc.nextInt();
		System.out.println("Enter the class count:");
		cls = sc.nextInt();
		System.out.println("Enter the student count:");
		stu = sc.nextInt();
		arr = new String[clg][cls][stu];
		System.out.println("Array is Created...");
		System.out.println("==========================");
	}
	public void collectData() {
		System.out.println("collecting the data:");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside the clg:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside the class:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the student marks:"+(k+1));
					arr[i][j][k] =sc.next();
				}
			}
		}
		System.out.println("data is collected:");
	}
	public void displayData() {
		System.out.println("Displaying the data:");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside the clg:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside the class:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("the student marks: "+ (k+1)+"are " 
				
							 + arr[i][j][k]);
				}
			}
		}
	}
	
}

public class Array2d {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array2DOps a = new Array2DOps();
		a.createArray();
		a.collectData();
		a.displayData();

	}

}
