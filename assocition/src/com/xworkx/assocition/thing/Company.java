package com.xworkx.assocition.thing;

public class Company {

	public String name;
	public String ceoName;
	public int since;
	public String address;
	
	public Company() {
		System.out.println("no-arg constructorto company");
	}	
	
	public void setCompany(String name,String deoName,int since) {
		this.name=name;
		this.ceoName=ceoName;
		this.since=since;
		this.address=address;
	}
	
	public void display() {
		System.out.println("Compnay name is :"+this.name);
		System.out.println("Compnay ceoName is :"+this.ceoName);
		System.out.println("Compnay since is :"+this.since);
		System.out.println("Compnay address is :"+this.address);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
