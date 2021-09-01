package com.ultramain.um21.main;

import com.ultramain.um21.inheritance.Car;
import com.ultramain.um21.inheritance.HondaCar;
import com.ultramain.um21.inheritance.MaruthiCar;

public class TestInheritance {
	public static void main(String[] args) {
		Car mycar=new HondaCar();
		Display.DisplayCarDetails(mycar);
	}
}