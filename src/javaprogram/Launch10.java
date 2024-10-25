package com.dest.basics.javaprogram;

import java.util.Scanner;

class InvalidUserException extends Exception{
	public String getMessage() {
		return "Invalid User. Please try again!!";
		
	}
}
class Customer{
	int accno = 111;
	int pin = 123;
	
	int accno_new;
	int pin_new;
	
	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the accno:");
		accno_new = sc.nextInt();
		System.out.println("Enter the pin: ");
	}
	void verify() throws InvalidUserException{
		if(accno==accno_new && pin == pin_new) {
			System.out.println("valid user");
		}
		else {
			InvalidUserExceptiom iue = new InvalidUserException();
		}
	}
}

public class Launch10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
