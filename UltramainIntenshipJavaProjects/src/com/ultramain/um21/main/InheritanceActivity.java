package com.ultramain.um21.main;

import com.ultramain.week2.Employee;
import com.ultramain.week2.Manager;
import com.ultramain.week2.Trainee;

public class InheritanceActivity {
	public static void main(String[] args) {
		Manager mymanager = new Manager(126534, "Peter", "Chennai India", 237844);
		mymanager.setBasicSalary(65000);
		double transportAllowance=mymanager.calculateTransportAllowance();
		double Salary=mymanager.calculatrSalary();
		System.out.println("Salary After Adding Transport Allowance : "+(transportAllowance+Salary));
		
		System.out.println("--------------------------------------------------");
		
		Trainee trainee=new Trainee(29846,"Jack","Mumbai India",442085);
		trainee.setBasicSalary(45000);
		double transport=trainee.calculateTransportAllowance();
		double Sal=trainee.calculatrSalary();
		System.out.println("Salary After Adding Transport Allowance : "+(transport+Sal));
	}
}
