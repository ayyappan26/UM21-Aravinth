package com.ultramain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import um21.DbConnection;
import um21.EmployeeDTO;

public class OracleDao implements IDao {

	/* (non-Javadoc)
	 * @see com.ultramain.dao.IDao#register()
	 */
	public void register() {
			
	}

	/* (non-Javadoc)
	 * @see com.ultramain.dao.IDao#update()
	 */
	public void update() {
		
	}

	/* (non-Javadoc)
	 * @see com.ultramain.dao.IDao#delete()
	 */
	public void delete() {
		
	}
	
	/* (non-Javadoc)
	 * @see com.ultramain.dao.IDao#view()
	 */
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
