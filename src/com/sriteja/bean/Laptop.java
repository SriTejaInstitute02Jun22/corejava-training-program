package com.sriteja.bean;

public class Laptop {

	//Laptop attribute/feature
	private String laptopName;
	private String colour;
	private String hardDisk;
	private String ram;
	private boolean grapicks;
	private int ports;
	private String bateryBackup;
	
	//non parameterized constructor 
	public Laptop() {
		
	}
	
	//parameterized constructor
	public Laptop(String laptopName, String colour, String hardDisk, String ram, boolean grapicks, int ports,
			String bateryBackup) {
		super();
		this.laptopName = laptopName;
		this.colour = colour;
		this.hardDisk = hardDisk;
		this.ram = ram;
		this.grapicks = grapicks;
		this.ports = ports;
		this.bateryBackup = bateryBackup;
	}
	
	//setter and getter method
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getHardDisk() {
		return hardDisk;
	}
	public void setHardDisk(String hardDisk) {
		this.hardDisk = hardDisk;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public boolean isGrapicks() {
		return grapicks;
	}
	public void setGrapicks(boolean grapicks) {
		this.grapicks = grapicks;
	}
	public int getPorts() {
		return ports;
	}
	public void setPorts(int ports) {
		this.ports = ports;
	}
	public String getBateryBackup() {
		return bateryBackup;
	}
	public void setBateryBackup(String bateryBackup) {
		this.bateryBackup = bateryBackup;
	}
	@Override
	public String toString() {
		return "Laptop [laptopName=" + laptopName + ", colour=" + colour + ", hardDisk=" + hardDisk + ", ram=" + ram
				+ ", grapicks=" + grapicks + ", ports=" + ports + ", bateryBackup=" + bateryBackup + "]";
	}
	
	
	
}
