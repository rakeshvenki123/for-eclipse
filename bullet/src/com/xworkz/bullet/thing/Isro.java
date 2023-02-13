package com.xworkz.bullet.thing;

public class Isro {

	public String[] locations;
	public int[] satelliteNoS;
	public Scientist[] scientists;

	public Isro() {
		System.out.println("no-arg const.... isro ");
	}

	public void setlocations(String[] locations) {
		this.locations = locations;

	}

	public void setSatelliteNoS(int[] satelliteNoS) {
		this.satelliteNoS = satelliteNoS;
	}

	public void setscientists(Scientist[]scientists) {
		this.scientists = scientists;
	}
	
	
	public void displayDisplay() {
		System.out.println("Details of Isro");
		
		if(this.locations != (null)) {
			for(int seq = 0; seq < this.locations.length; seq++) {
				String element = this.locations[seq];
				System.out.println("location:"+element + "at index" + seq);
			}
		} else {
			System.out.println("this.location is not pointing to any memory");
		}
		if(this.satelliteNoS != null) {
			for(int seq = 0; seq < this.satelliteNoS.length; seq++) {
				int element = this.satelliteNoS[seq];
				System.out.println("satellite numbers:"+element + "at index"+ seq);
			}
		}else {
			System.out.println("this.satellite is not pointing to any mamory");
		}
		if(this.scientists != null) {
			for(int seq = 0; seq < this.scientists.length; seq++) {
				Scientist element = this.scientists[seq];
				System.out.println("at index :" + seq);
				element.display();
			}
		}else {
			System.out.println("this.Scientists is not pointing to memory..");
		}
	
	}

}
