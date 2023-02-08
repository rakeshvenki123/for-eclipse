package com.xworkz.bullet.boot;

import com.xworkz.bullet.thing.Isro;

public class IsroRunner {

	public static void main(String[] args) {

		Isro isro = new Isro();

		String[] locs = { "mumbai", "banglore", "kolkata" };
		isro.setlocations(locs);

		int[] setNos = { 6, 4, 7 };
		isro.setSatelliteNoS(setNos);

	}

}
