package com.xworkz.bmw.thing;

public class Place {

	public String location;
	public String district;
	public int population;
	public String state;
	public String country;
 
	public Place() {
		
		System.out.println("started fronm Place");
	}
	
	public Place(String location) {
		this.location=location;
		
	}
	
	public Place(String location, String district) {
		this(location);
		this.district=district;
		
	}
	public Place(String location, String district,int population) {
		this(location,district);
		this.population=population;
	}
		public Place(String location, String district,int population,String state) {
			this(location,district,population);
			this.state=state;
		}
			public Place(String location, String district,int population,String state, String country) {
				this(location,district,population,state);
				this.country=country;
			
		
	}
	
	public void display() {
		System.out.println("display data");
		System.out.println("location:"+location);
		System.out.println("district:"+district);
		System.out.println("polulation:"+population);
		System.out.println("state:"+state);
		System.out.println("country:"+country);
		
		
		
		
	}	
		
		
	}





