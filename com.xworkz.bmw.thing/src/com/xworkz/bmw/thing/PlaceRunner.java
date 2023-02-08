package com.xworkz.bmw.thing;

public class PlaceRunner {

	public static void main(String[] args) {
		Place Place=new Place("shivamoga");
		Place.display();
	

		Place Place1=new Place("shivamoga" ,"shivamogar"); 
	    Place1.display();
		
		Place Place2=new Place("shivamoga","shivamoga",60);
		Place2.display();
		
		
        Place Place3=new Place("shivamoga","shivamoga",60,"karnataka");
        Place3.display();
        
        Place Place4=new Place("shivamoga","shivamoga",60,"karnataka","india");
		Place4.display();
        
		
		
		
	}		
		
}







