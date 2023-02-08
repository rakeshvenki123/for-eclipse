package com.xworkz.bullet.thing;

public class Engineer {

	public String name;
	public double salary;
	public String[] skills;
	public Degree[] degrees;

	public Engineer() {
		System.out.println("no - arg constructer for Engineer");

	}

	public void selfname(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("details of degree");
		
			if (this.name != null) {
				this.name=name;
				System.out.println(name);
		}
			if(this.salary != 0) {
				this.salary=salary;
				System.out.println(salary);
			}
			
			if(this.skills != null) {
				for(int i=0; i<skills.length;i++) {
					String ele = skills[i];
					System.out.println(ele);
				}
			}
			
			
			
	}

}
