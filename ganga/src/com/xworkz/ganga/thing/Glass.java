package com.xworkz.ganga.thing;

public class Glass {
 
	public String colour;
	public double cost;
	
	public Glass(String colour,double cost) {
		this.colour=colour;
		this.cost=cost;
	}
	
	public void display() {
		System.out.println("colour:"+colour);
		System.out.println("cost:"+cost);
	}
	
}
