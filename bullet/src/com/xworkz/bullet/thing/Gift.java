package com.xworkz.bullet.thing;

public class Gift {
 
	public String colour;
	public int cost;
	public Box box;
	
	public Gift() {
		System.out.println("no org const gift");	
	}
	
	public Gift(String colour,int cost) {
		this.colour=colour;
		this.cost=cost;
	}
	
	public void inti(Box box) {
		this.box=box;
	}
	
	public void display() {
		System.out.println("colour:"+this.colour);
		System.out.println("cost:"+this.cost);
	
	
	if(box!=null) {
		this.box.display();
	}else {
		System.err.println("this box is not pointibg to memory");
	}
		
	
}
	
	}
