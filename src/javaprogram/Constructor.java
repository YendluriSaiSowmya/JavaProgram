package com.dest.basics.javaprogram;

class Dog1 extends Object
{
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	
	
	
	
	public Dog1() {
		super();
		System.out.println("showing values after the ececuting zero parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("==============================");
	}
	
	//single parameterized constructor
	public Dog1(String name ) {
		this("Rocky","Brown");
		System.out.println("showing values after the ececuting 1 parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("==============================");
	}
	
	//2 parameterized constructor
	public Dog1(String name, String color) {
		this("Rocky","Brown",7000);
		this.name=name;
		this.color=color;
		System.out.println("showing values after the ececuting 2 parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("==============================");
	}
	
	//3 parameterized constructor
	public Dog1(String name, String color, int cost) {
		this("shocky","black",9000,5);
		this.name = name;
		this.color = color;
		this.cost = cost;
		System.out.println("showing values after the executing 3 parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("==============================");
	}
	
	//4 parameterized constructor
	public Dog1(String name, String color, int cost, int age) {
		this("Bunty","White",9000,6,"GR");
		this.name = name;
		this.color = color;
		this.cost = cost;
		this.age = age;
		System.out.println("showing values after the executing 4 parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("==============================");
		
		
	}
	//5 parameterized constructor
	public Dog1(String name, String color, int cost, int age, String breed) {
		this();
		this.name=name;
		this.color=color;
		this.cost=cost;
		this.age=age;
		this.breed=breed;
		System.out.println("showing values after the executing 5 parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("==============================");
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	public int getCost() {
		return cost;
	}
	public int getAge() {
		return age;
	}
	public String getBreed() {
		return breed;
	}
	
	
}

public class Constructor {

	public static void main(String[] args) {
		Dog1 d = new Dog1("vicky");
		System.out.println(d.getName());
		System.out.println(d.getColor());
		System.out.println(d.getCost());
		System.out.println(d.getAge());
		System.out.println(d.getBreed());
		
		

	}

}
