package com.xworkz.ganga.boot;

public class Shirt {

	public String colour;
	public int cost;
	public String brand;
	public Button Button  =new Button();
	
	public void inti(String colour,int cost, String brand) {
		this.colour=colour;
		this.cost=cost;
		this.brand=brand;
	}
	public void display() {
		System.out.println("colour:"+colour);
		System.out.println("cost:"+cost);
		System.out.println("brand:"+brand);
		this.Button.display();
	}
	
	
	
	
	
	
	
	
	
}
