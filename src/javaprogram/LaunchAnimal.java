package com.dest.basics.javaprogram;

class Animal{
	void sounds() {
		System.out.println("Animal Sounds");
		
	}
	void legs() {
		System.out.println("Animal have 4 legs");
	}
	void drinks() {
		System.out.println("Animal drink water");
	}
	
}
class Dogs extends Animal{

	void sounds() {
		System.out.println("Dog sounds like bow bow");
	}
	void dogEats() {
		System.out.println("Dog is a non vegeterian");
	}
}	
class Cats extends Animal{
	void sounds() {
		System.out.println("Cat sounds like meow");
	}
	void catEats() {
		System.out.println("Cat is a non vegeterian");
	}

}
class Tigers extends Animal{
	void sounds() {
		System.out.println("Tiger sounds like rors");
	}
	void tigerEats() {
		System.out.println("Tiger is a non vegeterian");
	}
}
class Forest{
	void permit(Animal ref) {
		ref.sounds();
		ref.legs();
		ref.drinks();
	}
}

public class LaunchAnimal {

	public static void main(String[] args) {
		Forest f = new Forest();
		Dogs d = new Dogs();
		f.permit(d);
		System.out.println("=============================");
		Cats c = new Cats();
		f.permit(c);
		System.out.println("=============================");
		Tigers t = new Tigers();
		f.permit(t);
		

	}

}
