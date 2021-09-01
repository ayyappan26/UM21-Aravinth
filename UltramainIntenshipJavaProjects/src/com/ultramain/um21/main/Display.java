package com.ultramain.um21.main;

import com.ultramain.um21.inheritance.Car;
import com.ultramain.um21.inheritance.HondaCar;
import com.ultramain.um21.inheritance.MaruthiCar;

public class Display {
	public static void DisplayCarDetails(Car newcar) {
		if(newcar instanceof MaruthiCar){
			MaruthiCar mycar=(MaruthiCar)newcar;
			mycar.Type();
			mycar.HornType();
			mycar.stering();
			mycar.vehicleType();
		}
		if(newcar instanceof HondaCar){
			HondaCar mycar=(HondaCar)newcar;
			mycar.Seats();
			mycar.HornType();
			mycar.stering();
			mycar.vehicleType();
		}
		
	}
}
