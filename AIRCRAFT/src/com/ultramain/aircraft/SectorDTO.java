package com.ultramain.aircraft;

public class SectorDTO {
	private String sectorId;
	private String aircraftCode;
	private String fromStation;
	private String ToStation;
	private String date;
	private String time;
	public String getSectorId() {
		return sectorId;
	}
	public void setSectorId(String sector) {
		this.sectorId = sector;
	}
	public String getAircraftCode() {
		return aircraftCode;
	}
	public void setAircraftCode(String aircraftCode) {
		this.aircraftCode = aircraftCode;
	}
	public String getFromStation() {
		return fromStation;
	}
	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}
	public String getToStation() {
		return ToStation;
	}
	public void setToStation(String lastStation) {
		this.ToStation = lastStation;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
}
