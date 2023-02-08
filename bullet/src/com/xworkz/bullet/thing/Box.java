package com.xworkz.bullet.thing;

public class Box {

	public String name;
	public String shape;
	
	public Box(String name,String shape) {
		this.name=name;
		this.shape=shape;
	}
	
	public void display() {
		System.out.println("name:"+this.name);
		System.out.println("shape:"+this.shape);
	}
	
}
