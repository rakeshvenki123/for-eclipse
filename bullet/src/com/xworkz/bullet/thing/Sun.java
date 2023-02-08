package com.xworkz.bullet.thing;

public class Sun {

	public String name;
	public String energy;
	
	public Sun(String name,String energy) {
		this.name=name;
		this.energy=energy;
	}
	
	public void display() {
		System.out.println("name:"+this.name);
		System.out.println("energy:"+this.energy);
	}

	
	
}
