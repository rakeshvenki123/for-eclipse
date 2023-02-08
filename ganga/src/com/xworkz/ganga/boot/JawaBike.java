package com.xworkz.ganga.boot;

public class JawaBike {

	public String parts;
	public int budget;
	public boolean validity;
	public Enagine Enagine=new Enagine();
	
	
	public void inti(String parts,int budget,boolean validity) {
		this.parts=parts;
		this.budget=budget;
		this.validity=validity;
		
	}
	
	public void display() {
		System.out.println("parts:"+parts);
		System.out.println("budget:"+budget);
		System.out.println("validity:"+validity);
		this.Enagine.display();
	}

	
	
	
	
	
	
	
	
}
