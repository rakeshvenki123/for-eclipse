package com.xworkz.basics_eclipse.thing;

import com.xworkz.basics_eclipse.boot.Film;

public class FilmRunner {

	public static void main(String[] args) {
		Film ref=new Film();
		
		System.out.println("Ticket"+ ref.ticket);
		System.out.println("Cost"+ ref.cost);
		System.out.println("ExtraTime"+ ref.extraTime);
		System.out.println("Ammount"+ ref.ammount);
		System.out.println("Hero"+ ref.hero);
		

		ref.ticket="vasavi";
		ref.cost=145;
		ref.extraTime=false;
		ref.ammount=435;
		ref.hero="darshan";
		
		System.out.println( ref.ticket);
		System.out.println(ref.cost);
		System.out.println( ref.extraTime);
		System.out.println( ref.ammount);
		System.out.println( ref.hero);
		
		
		
		
	}

}
