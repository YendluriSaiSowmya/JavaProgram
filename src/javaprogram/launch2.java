package com.dest.basics.javaprogram;

import java.util.Scanner;

abstract class Shapes{
	double area;
	
	abstract void collectData();
	abstract void calculate();
	void display() {
		System.out.println("The area is ="+ area);
	}
	
}
class circle extends Shapes{
	private double r;
	private final double pi = 3.14768;
	void collectData() {
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
	}
	void calculate() {
		area=pi*r*r;
	}
	
}
class square extends Shapes{
	private double side;
	void collectData() {
		Scanner sc = new Scanner(System.in);
		side = sc.nextDouble();
	}
	void calculate() {
		area = side * side;
	}
}
class rectangle extends Shapes{
	private double l,b;
	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length :");
		l = sc.nextDouble();
		System.out.println("Enter breadth :");
		b = sc.nextDouble();
		
	}
	void calculate() {
		area = l* b;
	}
}
class Geometry{
	void useShapes(Shapes s) {
		s.collectData();
		s.calculate();
		s.display();
	}
}

public class launch2 {

	public static void main(String[] args) {
		circle c = new circle();
		square s = new square();
		rectangle r = new rectangle();
		Geometry g = new Geometry();
		System.out.println("Circle based operation");
		g.useShapes(c);
		System.out.println("=======================");
		System.out.println("square based operation");
		g.useShapes(s);
		System.out.println("=======================");
		System.out.println("rectangle based operation");
		g.useShapes(r);
		System.out.println("=======================");



	}

}
