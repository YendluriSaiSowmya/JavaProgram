package com.dest.basics.javaprogram;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		int count=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}

	}

}
