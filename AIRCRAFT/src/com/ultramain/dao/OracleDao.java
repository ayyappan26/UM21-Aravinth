package com.ultramain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.ultramain.aircraft.DbConnection;
import com.ultramain.aircraft.SectorDTO;

public class OracleDao implements IDao {
	
	public void registerAircraft() throws SQLException{
		Connection con=DbConnection.getDbConnection();
		PreparedStatement pst = con.prepareStatement("SELECT aircraft_code FROM aircraft");
		ResultSet rst = pst.executeQuery();
		System.out.println("Enter The AircraftCode and it should not be : ");
		while(rst.next()){
			System.out.println(rst.getString(1));
		}
		Scanner scanner = new Scanner(System.in);
		String aircraftCode=scanner.next();
		System.out.println("Enter the Description of the Aircraft : ");
		String description=scanner.next();
		String sql="insert into aircraft values(?,?)";
		pst = con.prepareStatement(sql);
		pst.setString(1, aircraftCode);
		pst.setString(2, description);
		rst = pst.executeQuery();
		System.out.println(rst+" Rows Inserted");
		
	}
	
	
	public void registerSectorDetails() throws SQLException{
		Connection con=DbConnection.getDbConnection();
		PreparedStatement pst = con.prepareStatement("SELECT aircraft_code FROM aircraft");
		ResultSet rst = pst.executeQuery();
		System.out.println("Enter The AircraftCode and it should be : ");
		while(rst.next()){
			System.out.println(rst.getString(1));
		}
		Scanner scanner = new Scanner(System.in);
		String aircraftCode=scanner.next();
		System.out.println("Enter the SectorId for the aircraft and it should not be : ");
		pst = con.prepareStatement("SELECT sector_id FROM sector");
		rst = pst.executeQuery();
		System.out.println("Enter The AircraftCode and it should be : ");
		while(rst.next()){
			System.out.println(rst.getString(1));
		}
		String SectorId=scanner.next();
		System.out.println("Enter the fromStation : ");
		String fromStation=scanner.next();
		System.out.println("Enter the toStation : ");
		String toStation=scanner.next();
		System.out.println("Enter the Date : ");
		String date=scanner.next();
		System.out.println("Enter the time : ");
		String time=scanner.next();
		String sql="insert into sector values(?,?,?,?,?,?)";
		pst = con.prepareStatement(sql);
		pst.setString(1, SectorId);
		pst.setString(2, aircraftCode);
		pst.setString(3, fromStation);
		pst.setString(4, toStation);
		pst.setString(5, date);
		pst.setString(6, time);
		rst = pst.executeQuery();
		System.out.println(rst+" Rows Inserted");
	}
	
	
	
	
	public ArrayList<SectorDTO> viewAircraft(String aircraftCode) throws SQLException {
		SectorDTO secDto = null;
		ArrayList<SectorDTO> list = new ArrayList<SectorDTO>();
		Connection con = DbConnection.getDbConnection();
		String sql = "SELECT * FROM sector where aircraft_code= ? ";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, aircraftCode);
		ResultSet rst = pst.executeQuery();
		while (rst.next()) {
			secDto = new SectorDTO();
			secDto.setSectorId(rst.getString(1));
			secDto.setAircraftCode(rst.getString(2));
			secDto.setFromStation(rst.getString(3));
			secDto.setToStation(rst.getString(4));
			secDto.setDate(rst.getString(5));
			secDto.setTime(rst.getString(6));
			list.add(secDto);
		}
		return list;
	}

	public HashMap<String, ArrayList<SectorDTO>> getAllAircraftBysector() throws SQLException {
		Connection con = DbConnection.getDbConnection();
		String sql = "select DISTINCT aircraft_code from aircraft";
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rst = pst.executeQuery();
		ArrayList<String> list = new ArrayList<String>();
		HashMap<String, ArrayList<SectorDTO>> map = new HashMap<>();
		while (rst.next()) {
			list.add(rst.getString(1));
		}
		for (String aircraftCode : list) {
			ArrayList<SectorDTO> sectordto = viewAircraft(aircraftCode);
			map.put(aircraftCode, sectordto);
			System.out.println("Aircraft Code must be " + aircraftCode);
		}
		return map;
	}
}
