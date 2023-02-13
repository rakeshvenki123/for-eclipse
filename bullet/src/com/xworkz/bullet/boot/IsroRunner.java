package com.xworkz.bullet.boot;

import com.xworkz.bullet.thing.Isro;
import com.xworkz.bullet.thing.Scientist;

public class IsroRunner {

	public static void main(String[] args) {

		Isro isro = new Isro();

		String[] locs = { "mumbai", "banglore", "kolkata" };
		isro.setlocations(locs);

		int[] setNos = { 6, 4, 7 };
		isro.setSatelliteNoS(setNos);

        Scientist scientist = new  Scientist();
        scientist.setname("abdul kalam");
        scientist.setdesignation("senior Scientist");

        Scientist scientist1 = new Scientist();
        scientist1.setname("homi bhabha");
        scientist1.setdesignation("director");
        
        Scientist[] ref = (scientist. scientist1 );
        isro.setscientists(ref);
        
        
	}
}
