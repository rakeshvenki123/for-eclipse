package com.xworkz.ganga.boot;

public class Trainers {

	public String owner;
	public double salary;
	public int budget;

	public void inti(String owner, double salary, int budget) {
		this.owner = owner;
		this.salary = salary;
		this.budget = budget;
	}

	public void display1() {
		System.out.println("owner:"+owner);
		System.out.println("salary:"+salary);
		System.out.println("budget:"+budget);
	}
	
	
	
	
	
}