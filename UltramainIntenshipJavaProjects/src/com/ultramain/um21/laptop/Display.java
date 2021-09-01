package com.ultramain.um21.laptop;

public class Display {
	
	public void DisplayLaptopDetails(Laptop lap) {
		System.out.println("Make of the Laptop : "+lap.getMake());
		System.out.println("Model of the Laptop : "+lap.getModel());
		System.out.println("Company Name of the Laptop : "+lap.getCompanyName());

	}
}
