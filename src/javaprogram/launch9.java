package com.dest.basics.javaprogram;

import java.util.Scanner;


class Operation1 {
	void function1()throws Exception {
		System.out.println("Inside the function-1");
		Scanner sc = new Scanner(System.in);
		System.out.println("Division operation started");
		System.out.println("Enter the num-1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the num-2: ");
		int num2 = sc.nextInt();
		int res = num1/num2;
		System.out.println(res);
			
	}
}
class Operation2{
	void function2() throws Exception {
		System.out.println("Inside the function-2");
		Operation1 op1 = new Operation1();
		op1.function1();	
	}
	
}

public class launch9 {

	public static void main(String[] args) throws Exception {
		Operation2 op2=new Operation2();
				op2.function2();
		
		
	}

}
