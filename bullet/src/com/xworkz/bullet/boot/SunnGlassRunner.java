package com.xworkz.ganga.boot;

import com.xworkz.ganga.thing.Glass;
import com.xworkz.ganga.thing.SunGlass;

public class SunnGlassRunner {

	public static void main(String[] args) {

		SunGlass sunglass=new SunGlass("iconic",4566);
		sunglass.display();
		Glass glass=new Glass("black",5645);
		glass.display();
	}

}
