package com.xworkx.audi.thing;

public class Car {
	
	public String name;
	public String height;
	public int cost;
	public int size;
	public String colour;
 	public boolean validity;
 	public int  budget;
	
public Car() {
		
		System.out.println("started fronm Car");
	}
	

public Car(String name) {
	this.name=name;	
}

public Car(String name, String height) {
	this(name);
	this.height=height;
}

public Car(String name, String height,int cost) {
	this(name,height);
	this.cost=cost;
}

public Car(String name, String height,int cost,int size) {
	this(name,height,cost);
	this.size=size;
}
public Car(String name, String height,int cost,int size,String colour) {
	this(name,height,cost,size);
	this.colour=colour;
}
public Car(String name,String height,int cost,int size,String colore,boolean validity) {
	this(name,height,cost,size,colore);
	this.validity=validity;
}

public Car(String name,String height,int cost,int size,String colore,boolean validity,int budget) {
	this(name,height,cost,size,colore,validity);
	this.budget=budget;
}




public void display() {
	System.out.println("display data");
	System.out.println("name:"+name);
	System.out.println("height:"+height);
	System.out.println("cost:"+cost);
	System.out.println("size:"+size);
	System.out.println("colour:"+colour);
	System.out.println("validity:"+validity);
	System.out.println("budget:"+budget);
	
	
	
}



	
	






}







