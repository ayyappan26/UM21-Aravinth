package um21.ems.main;

import java.sql.SQLException;

import um21.ems.EmployeeBO;

public class EmployeeServices {

	public static void main(String[] args) {
		EmployeeBO emp=new EmployeeBO();
		try {
			emp.empSystem();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
