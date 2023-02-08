package com.xworkz.bmw.boot;

public class Place {

	public String location;
	public String district;
	public int population;
	public String state;
	public String country;
 
	public Place() {
		
		System.out.println("started fronm Place");
	}
	
	public Place(String location, String district, int population, String state, String country) {

		super ();
		this.location=location;
		this.district=district;
		this.population=population;
		this.state=state;
		this.country=country;
		
	}
	
	public Place(String location) {
		this.location=location;
		
	}
	
	public Place(String district,String location) {
		this.district=district;
	}
	
	public Place(String location,int population) {
		this.location=location;
		this.population=population;
	}
	public Place(int population,String district) {
		this.population=population;
		this.district=district;
	}
	public Place(String country,int population,String state) {
		this.country=country;
		this.population=population;
		this.state=state;
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





