package com.xworkz.ganga.thing;

public class Sweater {

	public int cost;
	public String shop;
	public Zip zip;
	
	public Sweater() {
		System.out.println("no-arg constructor Sweater");
	}
	
	public Sweater(int cost,String shop) {
		this.cost=cost;
		this.shop=shop;
	}
	
	public void inti(Zip zip) {
		this.zip=zip;
	}
	
	public void display() {
		System.out.println("cost:"+this.cost);
		System.out.println("shop:"+this.shop);
		if(zip!=null) {
			this.zip.display();
		}else {
			System.err.println("this zip is not pointing to memory");
		}
	}
	
	
	
	
	
}
