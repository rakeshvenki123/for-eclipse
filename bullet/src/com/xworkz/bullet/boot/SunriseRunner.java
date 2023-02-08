package com.xworkz.bullet.boot;

import com.xworkz.Sunrise;
import com.xworkz.bullet.thing.Sun;

public class SunriseRunner {

	public static void main(String[] args) {
		Sunrise sunrise=new Sunrise(6,true);
		sunrise.display();
		Sun sun=new Sun("ravi","proton");
		sun.display();

	}

}
