package com.ultramain.week2;

public class Manager extends Employee {

	public Manager(long employeeId, String employeeName, String employeeAdress, long employeePhone) {
		super(employeeId, employeeName, employeeAdress, employeePhone);
	}
	public double calculateTransportAllowance(){
		double transportAllowance=(15*getBasicSalary())/100;
		System.out.println("Transport Allowance : "+transportAllowance);
		return transportAllowance;
	}
}
