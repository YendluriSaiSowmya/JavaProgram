package com.dest.basics.javaprogram;
class Calculator{
	int add(int a, int b) {
		return a+b;
		
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}
	float add(float a, float b) {
		return a+b;
	}
	
	float add(float a, float b, float c) {
		return a+b+c;
	}
	double add(double a, double b) {
		return a+b;
	}
	double add(double a, double b, double c) {
		return a+b+c;
	}
	float add(int a, float b) {
		return a+b;
	}
	float add(float a, int b) {
		return a+b;
	}
	double add(int a, float b, double c) {
		return a+b+c;
	}
	
}

		


public class VirtualPolymorphism {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(10, 10));
		System.out.println(c.add(10, 10, 10));
		System.out.println(c.add(10.7f, 10.7f));
		System.out.println(c.add(15.27f, 15.27f, 10.8f));
		System.out.println(c.add(123.456, 789.123));
		System.out.println(c.add(123.456, 789.123, 456.789));
		System.out.println(c.add(10, 10.7f));
		System.out.println(c.add(10.7f, 15));
		System.out.println(c.add(15, 15.27, 157.215));
	}

}
