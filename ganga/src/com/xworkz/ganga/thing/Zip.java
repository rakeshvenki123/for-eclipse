package com.xworkz.ganga.thing;

public class Zip {

	public String colour;
	public double cost;
	
	public Zip(String colour,double cost) {
	 this.colour=colour;
	 this.cost=cost;
	}
	
	public void display() {
		System.out.println("colour:"+colour);
		System.out.println("cost:"+cost);
	}
	
	
	
}
