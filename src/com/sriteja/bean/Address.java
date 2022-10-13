package com.sriteja.bean;

public class Address {

	//attributes
	private int houseNum;
	private String colonyName;
	private String streetName;
	private int pinCode;
	private String landMark;
	
	//setter and getter methods
	public int getHouseNum() {
		return houseNum;
	}
	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}
	public String getColonyName() {
		return colonyName;
	}
	public void setColonyName(String colonyName) {
		this.colonyName = colonyName;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	
	//toString() method
	@Override
	public String toString() {
		return "Address [houseNum=" + houseNum + ", colonyName=" + colonyName + ", streetName=" + streetName
				+ ", pinCode=" + pinCode + ", landMark=" + landMark + "]";
	}
	
	
}
