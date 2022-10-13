package com.sriteja.bean;

public class CompanyDetails {

	//attributes
	private String companyName;
	private String companyPhonNum;
	private String companyAddress;
	private String companyGST;
	private float companyTurnover;
	private int companyManpower;
	private char companyCategiry;
	private String companyEmailId;
	
	//default constructor 
	public CompanyDetails() {
		
	}

	//parameterized constructor
	public CompanyDetails(String companyName, String companyPhonNum, String companyAddress, String companyGST,
			float companyTurnover, int companyManpower, char companyCategiry, String companyEmailId) {
		this.companyName = companyName;
		this.companyPhonNum = companyPhonNum;
		this.companyAddress = companyAddress;
		this.companyGST = companyGST;
		this.companyTurnover = companyTurnover;
		this.companyManpower = companyManpower;
		this.companyCategiry = companyCategiry;
		this.companyEmailId = companyEmailId;
	}

	//setter and getter methods
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyPhonNum() {
		return companyPhonNum;
	}

	public void setCompanyPhonNum(String companyPhonNum) {
		this.companyPhonNum = companyPhonNum;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyGST() {
		return companyGST;
	}

	public void setCompanyGST(String companyGST) {
		this.companyGST = companyGST;
	}

	public float getCompanyTurnover() {
		return companyTurnover;
	}

	public void setCompanyTurnover(float companyTurnover) {
		this.companyTurnover = companyTurnover;
	}

	public int getCompanyManpower() {
		return companyManpower;
	}

	public void setCompanyManpower(int companyManpower) {
		this.companyManpower = companyManpower;
	}

	public char getCompanyCategiry() {
		return companyCategiry;
	}

	public void setCompanyCategiry(char companyCategiry) {
		this.companyCategiry = companyCategiry;
	}

	public String getCompanyEmailId() {
		return companyEmailId;
	}

	public void setCompanyEmailId(String companyEmailId) {
		this.companyEmailId = companyEmailId;
	}

	//toString() method
	@Override
	public String toString() {
		return "CompanyDetails [companyName=" + companyName + ", companyPhonNum=" + companyPhonNum + ", companyAddress="
				+ companyAddress + ", companyGST=" + companyGST + ", companyTurnover=" + companyTurnover
				+ ", companyManpower=" + companyManpower + ", companyCategiry=" + companyCategiry + ", companyEmailId="
				+ companyEmailId + "]";
	}
	
	
	
}
