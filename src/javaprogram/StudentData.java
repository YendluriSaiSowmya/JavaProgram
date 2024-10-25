package com.dest.basics.javaprogram;

class Data{
	private String name;
	private int sem;
	private String branch;
	private int year;
	
	
// generic setters
	void setData(String name,int sem, String branch, int year) {
		this.name = name;
		this.sem = sem;
		this.branch = branch;
		this.year = year;
	}
// specific setters
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSem() {
		return sem;
	}


	public void setSem(int sem) {
		this.sem = sem;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
	// generic setters
	void getData() {
		System.out.println(name);
		System.out.println(sem);
		System.out.println(branch);
		System.out.println(year);
	
		
	}
	
	
	
}

public class StudentData {

	public static void main(String[] args) {
		Data d = new Data();
		d.setData("sai",4,"CSE",2024);
		d.getData();
		
		Data d1 =  new Data();
		d1.setName("Sowmya");
		d1.setSem(8);
		d1.setBranch("AI");
		d1.setYear(2023);
		System.out.println("==================================");
		System.out.println(d1.getName());
		System.out.println(d1.getSem());
		System.out.println(d1.getBranch());
		System.out.println(d1.getYear());
	
		
	}

}
