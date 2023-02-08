package com.xworkz.ganga.thing;

public class SunGlass {

	public String name;
    public int cost;
	public Glass glass;
    
    public SunGlass() {
    System.out.println("no-arg constructor sunglass");
    }
	
	public SunGlass(String name,int cost) {
		this.name=name;
		this.cost=cost;
	}
	
	public void init(Glass glass) {
    	this.glass=glass;
    }
	
	public void display() {
		System.out.println("name:"+this.name);
		System.out.println("cost:"+this.cost);
		if(glass!=null) {
		this.glass.display();
		}else {
			System.err.println("this glass is no pointing to memory");
		}
	}
	
					
}
