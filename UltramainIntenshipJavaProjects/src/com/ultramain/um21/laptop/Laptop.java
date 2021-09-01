package com.ultramain.um21.laptop;

public class Laptop {
	private String make;
	private String model;
	private String companyName;
	private String processorType;
	private int ram;
	private int purchaseyear;
	
	public Laptop(){
		
	}
	
	public Laptop(String make, String model, String companyName, String processorType, int ramsize, int purchaseyear) {
		this.make = make;
		this.model = model;
		this.companyName = companyName;
		this.processorType = processorType;
		this.ram = ramsize;
		this.purchaseyear = purchaseyear;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getProcessorType() {
		return processorType;
	}
	public void setProcessorType(String processorType) {
		this.processorType = processorType;
	}
	
	public int getRamsize() {
		return ram;
	}
	public void setRamsize(int ramsize) {
		this.ram = ramsize;
	}
	
	public int getPurchaseyear() {
		return purchaseyear;
	}
	public void setPurchaseyear(int purchaseyear) {
		this.purchaseyear = purchaseyear;
	}
}
