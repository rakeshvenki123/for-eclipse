package com.xworkx.audi.thing;

public class CarRunner {

	public static void main(String[] args) {

		Car Car=new Car("Rolls Royas");
		Car.display();
		
		Car Car1=new Car ("Rolls Royas","60");
		Car1.display();
		
		Car Car2=new Car("Rolls Royas","60", 56566);
		Car2.display();
		
		Car Car3=new Car("Rolls Royas","60", 56566);
		Car3.display();
		
		Car Car4=new Car("Rolls Royas","60",56566,80,"Black");
		Car4.display();
		
		Car Car5=new Car("Rolls Royas","60",56566,80,"Black" ,true);
		Car5.display();
		
		Car Car6=new Car("Rolls Royas","60",56566,80,"Black" ,true,766546754);
		Car6.display();
		
		
	}
}
