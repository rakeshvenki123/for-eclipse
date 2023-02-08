package com.xworkz.ganga.boot;

public class Button {

	public String colour;
	public int cost;
	public String name;
	
	public void inti(String colour,int cost,String name) {
		this.colour=colour;
		this.cost=cost;
		this.name=name;
		
	}
	public void display() {
		System.out.println("colour:"+colour);
		System.out.println("cost:"+cost);
		System.out.println("name:"+name);
		
		
	}
	
	
	
	
	
	
	
	
}
