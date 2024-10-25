package com.dest.basics.javaprogram;

interface Calculator{
	int a =10;
	int b = 20;
	void add();
	void sub();
	default void div() {
		
	}
	static void mul() {
		
	}
	void mod() {
		
	}
}
interface Calculatorr{
	void add1();
	void sub1();
}
class test{
	
}
interface Test1{
	
}
class Sample extends test implements Calculator{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mod() {
		// TODO Auto-generated method stub
		
	}
	
}
class calcy implements Calculatorr, Calculator{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub1() {
		// TODO Auto-generated method stub
		
	}
	
}
interface Calculator2 implements Calculator{
	
}
interface Calculator3 extends Calculator{
	
}
class calcy1 implements Calculator{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mod() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Launch4 {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		Calculator c2;
		Calculator c1 = new Calculator() {

			@Override
			public void add() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void sub() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mod() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}

}
