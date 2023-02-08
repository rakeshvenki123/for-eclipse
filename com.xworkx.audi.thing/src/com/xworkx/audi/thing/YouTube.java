package com.xworkx.audi.thing;

public class YouTube {
	
	public String name;
	public String colour;
	public int cost;
	public int budget;
	public String source;
	public String owner;
	public int follower;
	
   public YouTube() {
	  
	   System.out.println("Started from YouTube");
   }
   
   public YouTube (String name){
	  this.name=name;
   }
   public YouTube (String name,String colour){
	  this(name);
	  this.colour=colour;
   }
   public YouTube (String name,String colour,int cost){
	   this(name,colour);
	   this.cost=cost;
   }
   public YouTube(String name,String colour,int cost,int budget) {
	   this(name,colour,cost);
	   this.budget=budget;
   }
   public YouTube(String name,String colour,int cost,int budget,String source) {
	   this(name.colour.cost.budget);
	   this.source=source;
   }
   public YouTube(String name,String colour,int cost,int budget,String source,String owner) {
	   this (name.colour.cost.budget.source);
	   this.owner=owner;   
   }
   public YouTube(String name,String colour,int cost,int budget,String source,String owner,int follower) {
	   this(name.colour.cost.budget.source.owner);
	   this.follower=follower;
   }
   
   
public void display() {
	System.out.println("display data");
	System.out.println("name:"+name);
	System.out.println("colour:"+colour);
	System.out.println("cost:"+cost);
	System.out.println("budget:"+budget);
	System.out.println("source:"+source);
	System.out.println("owner:"+owner);
	System.out.println("follower:"+follower);
	
}
   
   

}
