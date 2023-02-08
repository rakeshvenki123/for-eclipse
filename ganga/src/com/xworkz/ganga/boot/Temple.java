package com.xworkz.ganga.boot;

public class Temple {

	public String location;
	public String name;
	public int population;
	public God God=new God();

	public void inti(String location, String name, int population) {
		this.location = location;
		this.name=name;
		this.population = population;

	}

	public void display() {
		System.out.println("location:" + location);
		System.out.println("name:"+name);
		System.out.println("population:" + population);
		this.God.display();
	}
}
