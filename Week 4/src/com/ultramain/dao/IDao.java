package com.ultramain.dao;

import java.sql.SQLException;
import java.util.Map;

import um21.EmployeeDTO;

public interface IDao {
	public void register();
	public void update();
	public void delete();
	public Map<Integer, EmployeeDTO> view() throws SQLException;

}
