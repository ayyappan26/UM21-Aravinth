package com.ultramain.um21.main;

import com.ultramain.um21.array.EmployeeDTO;
import com.ultramain.um21.array.EmployeeService;

public class TestArray {

	public static void main(String[] args) {
		
		EmployeeService emp=new EmployeeService();
		EmployeeDTO empDTO[]=emp.getUserDetails();
		emp.printEmployeeDetails(empDTO);
	}

}
