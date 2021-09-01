package com.ultramain.um21.array;

import java.util.Scanner;

public class EmployeeService {
	public EmployeeDTO[] getUserDetails() {
		Scanner sc = EmployeeUtility.getScannerInstsnce();
		System.out.println("Enter The Number Of Employees...");
		int empNum = sc.nextInt();
		EmployeeDTO employeeDTO[] = new EmployeeDTO[empNum];
		EmployeeDTO empDTO = null;

		for (int i = 0; i < empNum; i++) {
			empDTO = new EmployeeDTO();
			System.out.println("Enter The Details Of Employee " + (i + 1));
			System.out.println("Enter the ID :");
			empDTO.setEmpId(sc.nextInt());
			System.out.println("Enter the Name :");
			empDTO.setEmpName(sc.next());
			System.out.println("Enter the Dept :");
			empDTO.setDept(sc.next());
			System.out.println("Enter the Salary :");
			empDTO.setSalary(sc.nextFloat());
			employeeDTO[i] = empDTO;
		}
		return employeeDTO;
	}
	public void printEmployeeDetails(EmployeeDTO[] empDetails){
		EmployeeDTO empDTO=null;
		for(int i=0;i<empDetails.length;i++){
			empDTO=empDetails[i];
			System.out.println("The Details Of Employee "+(i+1));
			System.out.println("Employee ID : "+empDTO.getEmpId());
			System.out.println("Employee Name : "+empDTO.getEmpName());
			System.out.println("Employee Dept : "+empDTO.getDept());
			System.out.println("Employee Salary : "+empDTO.getSalary());
		}
	}
}
