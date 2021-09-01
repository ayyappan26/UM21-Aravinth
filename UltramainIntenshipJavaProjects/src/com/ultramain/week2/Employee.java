package com.ultramain.week2;

public class Employee {
	private long EmployeeId;
	private String EmployeeName;
	private String EmployeeAdress;
	private long EmployeePhone;
	private double BasicSalary;
	public static final double SpecialAllowance=250.80;
	public static final double Hra=1000.50;
	public Employee(long employeeId, String employeeName, String employeeAdress, long employeePhone) {
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeeAdress = employeeAdress;
		EmployeePhone = employeePhone;
	}
	
	public double getBasicSalary() {
		return BasicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		BasicSalary = basicSalary;
	}
	public double calculateTransportAllowance(){
		double transportAllowance=(10*BasicSalary)/100;
		System.out.println("Transport Allowance : "+transportAllowance);
		return transportAllowance;
	}

	public double calculatrSalary(){
		double salary=BasicSalary+(BasicSalary*SpecialAllowance/100)+(BasicSalary*Hra/100);
		System.out.println("The Salary Of The Employee : "+salary);
		return salary;
		
	}

}
