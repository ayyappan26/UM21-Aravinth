package com.ultramain.aircraft;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.ultramain.dao.IDao;
import com.ultramain.factory.AbstractFactory;

public class AircraftBo {
	public void sectorDetails(){
		AbstractFactory factory = AbstractFactory.getFactory(1);
		IDao dao = factory.getDao();
		try {
			
			ArrayList<SectorDTO> secDto = dao.viewAircraft("B777");
			if (!secDto.isEmpty()) {
				for (SectorDTO sec : secDto) {
					System.out.println("Sector Id : " + sec.getSectorId());
					System.out.println("Aircraft Code : " + sec.getAircraftCode());
					System.out.println("From Station : " + sec.getFromStation());
					System.out.println("To Station : " + sec.getToStation());
					System.out.println("Date : " + sec.getDate());
					System.out.println("Time : " + sec.getTime());
					System.out.println("--------------------------------");

				}
			}
		} catch (SQLException e) {
	
			e.printStackTrace();
		} 
	}
	public void aircraft() {
		AbstractFactory factory = AbstractFactory.getFactory(1);
		IDao dao = factory.getDao();
		try {
			HashMap<String, ArrayList<SectorDTO>> map = dao.getAllAircraftBysector();
			System.out.println("Enter the Aircraft Code : ");
			String aircraftCode = new Scanner(System.in).next();
			ArrayList<SectorDTO> secDto = map.get(aircraftCode);
			if (!secDto.isEmpty()) {
				for (SectorDTO sec : secDto) {
					System.out.println("Sector Id : " + sec.getSectorId());
					System.out.println("Aircraft Code : " + sec.getAircraftCode());
					System.out.println("From Station : " + sec.getFromStation());
					System.out.println("To Station : " + sec.getToStation());
					System.out.println("Date : " + sec.getDate());
					System.out.println("Time : " + sec.getTime());
					System.out.println("--------------------------------");

				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public void addAircraft(){
		AbstractFactory factory = AbstractFactory.getFactory(1);
		IDao dao = factory.getDao();
		try {
			dao.registerAircraft();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void addSector(){
		AbstractFactory factory = AbstractFactory.getFactory(1);
		IDao dao = factory.getDao();
		try {
			dao.registerSectorDetails();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
