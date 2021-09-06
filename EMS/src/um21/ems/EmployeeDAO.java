package um21.ems;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeDAO {

	public void viewEmployees() throws SQLException {
		Connection con = DbConnection.getDbConnection();
		System.out.println("Enter the Employee ID to view the details: ");
		Scanner scan = new Scanner(System.in);
		int empId = scan.nextInt();

		String sqlQuery = "Select *  FROM employee WHERE EMPLOYEE_ID = " + empId;
		PreparedStatement pst = con.prepareStatement(sqlQuery);
		ResultSet rs = pst.executeQuery();
		String first_name;
		String last_name;
		float salary;

		while (rs.next()) {
			empId = rs.getInt(1);
			first_name = rs.getString(2);
			last_name = rs.getString(3);
			salary = rs.getFloat(4);

			System.out.println("Employee_id : " + empId);
			System.out.println("First Name : " + first_name);
			System.out.println("Last Name : " + last_name);
			System.out.println("Salary : " + salary);
			System.out.println("----------------------------------");

		}
	}

	public void registerEmployee(EmployeeDTO empDto) throws SQLException {
		Connection con = DbConnection.getDbConnection();
		String sql = "INSERT INTO employee VALUES (?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, empDto.getEmpId());
		pst.setString(2, empDto.getFirst_Name());
		pst.setString(3, empDto.getLast_Name());
		pst.setFloat(4, empDto.getSalary());
		int rowsUpdated = pst.executeUpdate();

		System.out.println("Employee Registered Successfully!: " + rowsUpdated);

	}

	public void updateEmployee(EmployeeDTO empDto) throws SQLException {

		System.out.println("Type the Employee ID for whom you want to update the details");
		Utility scan = new Utility();
		int empId = scan.getScannerInstance().nextInt();
		Connection con = DbConnection.getDbConnection();
		String sql = "Update employees SET SALARY=?" + " WHERE EMPLOYEE_ID =" + empId;
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setFloat(1, empDto.getSalary());
		int rowsUpdated = pst.executeUpdate();
		System.out.println("Employee Details Updated Successfully!: " + rowsUpdated);
	}
}
