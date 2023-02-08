package com.xworkz.ganga.boot;

public class Xworkz {
	
	public String location;
	public int student;
	public int chair;
	public Trainers Trainers =new Trainers();
	
	public void inti(String location,int student,int chair) {
		this.location=location;
		this.student=student;
		this.chair=chair;
			
	}
	public void display() {
		System.out.println("location:"+location);
		System.out.println("student:"+student);
		System.out.println("chair:"+chair);
		this.Trainers.display1();
	
	}
	
	
	
	
	

}
