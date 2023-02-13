package com.xworkx.assocition.boot;

import com.xworkx.assocition.thing.Area;
import com.xworkx.assocition.thing.City;
import com.xworkx.assocition.thing.Company;
import com.xworkx.assocition.thing.Country;
import com.xworkx.assocition.thing.Security;
import com.xworkx.assocition.thing.State;

public class AreaRunner {

	public static void main(String[] args) {

		Area area=new Area("Rajajinagar", 664445,34567);
		area.display();
		
		System.out.println("=================================");
		City city = new City();
		city.setcity("Bidar","Bidar","India");	
		city.setArea(area);
		city.display();
		
		System.out.println("=================================");
		State state = new State();
		state.setState("karnataka", "basawaraj bommai", "kannada");	
		state.setCity(city);
		state.display();
		
		System.out.println("=================================");
		Country country = new Country();
		country.setCountry("india", "dropadi murmmu", "govtrnement");
	    country.setState(state);
	    country.display();
		
		Company company = new Company();
		company.setCompany ("SVI","Venkatrao", 1970  );
		
		Security security = new Security();
		security.setsecurity("uniformDept", 566, 66);
		security.setCompany(company);
		
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}


