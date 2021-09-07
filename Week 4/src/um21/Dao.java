package um21;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Dao {

	public Map<Integer,EmployeeDTO> view() throws SQLException {
		EmployeeDTO empDto=null;
		Connection con = DbConnection.getDbConnection();
		String sql = "SELECT * FROM EMPLOYEE";
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rst = pst.executeQuery();
		System.out.println(rst);
		int empId;
		String first_name;
		String last_name;
		float salary;
		Map<Integer, EmployeeDTO> map = new HashMap<>();
		while (rst.next()) {
			empDto=new EmployeeDTO();
			empId = rst.getInt(1);
			first_name = rst.getString(2);
			last_name = rst.getString(3);
			salary = rst.getFloat(4);
			empDto.setEmpId(empId);
			empDto.setFirst_Name(first_name);
			empDto.setLast_Name(last_name);
			empDto.setSalary(salary);
			map.put(empId, empDto);
		}
		return map;
	}
}
/*EmployeeDTO emp = new EmployeeDTO(empId,first_name,last_name,salary);

List<EmployeeDTO>list=new ArrayList<>();
list.add(emp);*/
/*
 * System.out.println("Employee_id : " + empId);
 * System.out.println("First Name : " + first_name);
 * System.out.println("Last Name : " + last_name);
 * System.out.println("Salary : " + salary);
 * System.out.println("----------------------------------");
 */
/*
 * empDto.setEmpId(101); empDto.setFirst_Name("Siva"); empDto.setLast_Name("P");
 * empDto.setSalary(35000);
 * 
 * 
 * String sql = "INSERT INTO Employee VALUES (?,?,?,?)"; PreparedStatement pst =
 * con.prepareStatement(sql); pst.setInt(1, empDto.getEmpId()); pst.setString(2,
 * empDto.getFirst_Name()); pst.setString(3, empDto.getLast_Name());
 * pst.setFloat(4, empDto.getSalary()); int rowsUpdated = pst.executeUpdate();
 * 
 * System.out.println("Employee Registered Successfully!: " + rowsUpdated);
 */