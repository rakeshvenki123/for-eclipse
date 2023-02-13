package com.xworkx.assocition.thing;

public class Security {

	public String deptname;
	public int totalstaff;
	public int headstaff;
	public Company company;
	
	public Security() {
		System.out.println("no-arg constructor to security");
	}
	
public void setsecurity(String deptname,int totalstaff,int headstaff) {
	this.deptname=deptname;
	this.totalstaff=totalstaff;
	this.headstaff=headstaff;
}
	public void setCompany(Company company) {
		this.company=company;
	}
	
	public void display() {
		System.out.println("security deptname is:"+this.deptname);
		System.out.println("security totalstaff is :"+this.totalstaff);
		System.out.println("security headstaff is :"+this.headstaff);

		if(this.company!=null) {
			this.company.display();
		}else {
			System.out.println("this company is not pointing to any memory");
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
