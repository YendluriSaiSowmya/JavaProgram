package com.dest.basics.javaprogram;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("#");
		}
	}

}
