package com.xworkx.assocition.thing;

public class Country {

	public String name;
	public String president;
	public String development;
	public State state;

	public void setCountry(String name, String president, String development) {
		this.name = name;
		this.president = president;
		this.development = development;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void display() {
		System.out.println("name:" + this.name);
		System.out.println("president:" + this.president);
		System.out.println("development:" + this.development);

		if (this.state != null) {
			this.state.display();
		} else {
			System.out.println("this.state is pointing to any memory");
		}

	}

}
