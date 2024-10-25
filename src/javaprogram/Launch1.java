package com.dest.basics.javaprogram;

abstract class Plane{
	void takeoff() {
		System.out.println("plane tookoff");
	}
	abstract void fly();
	void land() {
		System.out.println("plane landed");
	}
}
class Cargoplane extends Plane{
	
	void fly() {
		System.out.println("cargo plane is flying");
	}
}
class PassengePlane extends Plane{
	void fly() {
		System.out.println("passenger plane is flying");
	}
}
class FighterPlane extends Plane{
	void fly() {
		System.out.println("fighter plane is flying");
	}
}

class Airport{
	void permit(Plane ref) {
		ref.takeoff();
		ref.fly();
	}
}
public class Launch1 {

	public static void main(String[] args) {
		Airport a = new Airport();
		Cargoplane cp = new Cargoplane();
		PassengePlane pp = new PassengePlane();
		FighterPlane fp = new FighterPlane(); 
		a.permit(cp);
		a.permit(pp);
		a.permit(fp);

	
		
		

	}

}
