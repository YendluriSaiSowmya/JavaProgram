package com.dest.basics.javaprogram;

class Dog{
	private String name;
	private int age;
	private String color;
	private int cost;
	private String breed;
	
	
// generic setters
	void setData(String name,int age, String color, int cost,String breed) {
		this.name = name;
		this.age = age;
		this.color = color;
		this.cost = cost;
		this.breed = breed;
	}
// specific setters
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	// generic setters
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(cost);
		System.out.println(color);
		System.out.println(breed);
		
	}
	
	
	
}

public class ShadowProblem {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setData("Tommy",4,"brown",7000,"GR");
		d.getData();
		
		Dog d1 =  new Dog();
		d1.setName("Rocky");
		d1.setAge(4);
		d1.setColor("Black");
		d1.setCost(9000);
		d1.setBreed("Pug");
		System.out.println("==================================");
		System.out.println(d1.getName());
		System.out.println(d1.getAge());
		System.out.println(d1.getColor());
		System.out.println(d1.getCost());
		System.out.println(d1.getBreed());
		
		
		
		
	}

}
