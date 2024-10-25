package com.dest.basics.javaprogram;

import java.util.Scanner;
public class Alphabet3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0
					||i==(n-1)
					||i==(n/2)
					||i+j==(n/2)
					||i==(n-1)+(n/2)) 
					
					System.out.print("* ");
			}
			for(int j=0;j<i;j++) {
					System.out.println("- ");
			}
			
			System.out.println();
		}
	}
}
	
	

		
		
