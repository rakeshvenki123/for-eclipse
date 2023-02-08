package com.xworkz;

import com.xworkz.bullet.thing.Sun;

public class Sunrise {

	public int time;
	public boolean rise;
	public Sun sun;
	
	public Sunrise() {
		System.out.println("no-org const sunrise");	
	}

	public Sunrise(int time,boolean rise) {
		this.time=time;
		this.rise=rise;
	}
	public void init(Sun sun) {
		this.sun= sun;
	}
	
	
	public void display() {
		System.out.println("time:"+this.time);
		System.out.println("rise:"+this.rise);	
	
	
	if(sun!=null) {
		this.sun.display();
	}else {
		System.err.println("this sun is not pointibg to memory");
	}
		
		
		
	}
}
