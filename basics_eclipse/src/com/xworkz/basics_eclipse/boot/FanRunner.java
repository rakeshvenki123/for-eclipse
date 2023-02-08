package com.xworkz.basics_eclipse.boot;

import com.xworkz.basics_eclipse.thing.Fan;

public class FanRunner {

	public static void main(String[] args) {
		Fan ref=new Fan();

		System.out.println("colore"+ ref.colore);
		System.out.println("cost"+ ref. cost);
		System.out.println("validity"+ ref.validity);
		
		
		ref.colore="white";
		ref.cost=4356;
		ref.validity=true;
		
		System.out.println(ref.colore);
		System.out.println(ref.cost);
		System.out.println(ref.validity);
		
	}

}
