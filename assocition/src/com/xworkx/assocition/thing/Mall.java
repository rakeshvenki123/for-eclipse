package com.xworkx.assocition.thing;

public class Mall {

	public String name;
	public boolean ambience;
	public int totalFloors;
	public Security security;
	
	public Mall() {
	System.out.println("no-arg construction to mall");
	}
	
	public void setMall(String name,boolean ambience,int totalFloor) {
	this.name=name;
	this.ambience=ambience;
	this.totalFloors=totalFloor;
	}
	
	public void setsecurity(Security security) {
	this.security=security;
	}
	
	public void display() {
		System.out.println("Mall name is:"+this.name);
		System.out.println("Mall ambience is:"+this.ambience);
		System.out.println("Mall totalFloor is:"+this.totalFloors);
 
	
	
	if(this.security != null) {
		this.security.display();
	}else {
		System.out.println("this.security is not pointing to any memory");
	}
	
	
	}
	
}	


