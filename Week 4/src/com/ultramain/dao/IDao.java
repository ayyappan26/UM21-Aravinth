package com.ultramain.dao;

import java.sql.SQLException;
import java.util.Map;

import um21.EmployeeDTO;

/**
 * @author Black
 * To take you to the respective Dao
 */
public interface IDao {
	
	/**
	 * To register a data in Dao.
	 */
	public void register();
	
	/**
	 * To update the data in the Dao.
	 */
	public void update();
	
	/**
	 * To delete the data in the Dao. 
	 */
	public void delete();
	
	/**
	 * @return
	 * @throws SQLException
	 *  To view the data in the Dao.
	 */
	public Map<Integer, EmployeeDTO> view() throws SQLException;

}
