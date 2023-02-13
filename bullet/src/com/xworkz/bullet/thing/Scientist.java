package com.xworkz.bullet.thing;

public class Scientist {

	public String name;
	public String designation;
	 
	public Scientist() {
		System.out.println("no- arg const..... Scientist");
	}
	
	public void setname(String  name) {
		this.name=name;		
	}
	public void setdesignation(String designation) {
	this.designation = designation;
	}
	
	public void display() {
		System.out.println("Details of scientist");
		System.out.println(this.name);
		System.out.println(this.designation);
	}
	
	
	
}
