package com.xworkz.ganga.boot;

public class phone {

	public String name;
	public int price;
	public String shop;
	public camara camara=new camara();

	public void inti(String name, int price, String shop) {
		this.name = name;
		this.price = price;
		this.shop = shop;
	}

	public void display() {
		System.out.println("name:"+name);
		System.out.println("price:"+price);
		System.out.println("shop:"+shop);
		this.camara.display();
		
	}
	
	
	
	
}
