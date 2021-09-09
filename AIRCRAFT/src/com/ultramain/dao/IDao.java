package com.ultramain.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.ultramain.aircraft.SectorDTO;

public interface IDao {
	public void registerAircraft() throws SQLException ;
	public void registerSectorDetails() throws SQLException;
	public ArrayList<SectorDTO> viewAircraft(String str) throws SQLException ;
	public HashMap<String,ArrayList<SectorDTO>> getAllAircraftBysector() throws SQLException ;
}
