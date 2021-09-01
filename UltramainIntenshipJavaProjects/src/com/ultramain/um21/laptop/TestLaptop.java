package com.ultramain.um21.laptop;

public class TestLaptop {

	public static void main(String[] args) {
		Laptop lap=new Laptop();
		lap.setMake("DELL");
		lap.setModel("Inspiron 14");
		lap.setCompanyName("DELL");
		lap.setProcessorType("Intel i5");
		lap.setRamsize(8);
		lap.setPurchaseyear(2016);
		
		Display lapdetails=new Display();
		lapdetails.DisplayLaptopDetails(lap);

	}

}
