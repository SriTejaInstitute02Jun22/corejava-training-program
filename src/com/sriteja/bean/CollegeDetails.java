package com.sriteja.bean;

public class CollegeDetails {

	//attributes
	private String collegeName;
	private int collegeStudentStrength;
	private String collegeStartDate;
	private String collegeAddress;
	private String collegeCategiry;
	private String collegeMobileNum;
	private char collegeGrade;
	private int collegeCode;
	private String collegeEmailId;
	private int collegeStaffStrength;
	
	//default constructor
	public CollegeDetails() {
		
	}
	
	
	//setter and getter methods
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getCollegeStudentStrength() {
		return collegeStudentStrength;
	}
	public void setCollegeStudentStrength(int collegeStudentStrength) {
		this.collegeStudentStrength = collegeStudentStrength;
	}
	public String getCollegeStartDate() {
		return collegeStartDate;
	}
	public void setCollegeStartDate(String collegeStartDate) {
		this.collegeStartDate = collegeStartDate;
	}
	public String getCollegeAddress() {
		return collegeAddress;
	}
	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}
	public String getCollegeCategiry() {
		return collegeCategiry;
	}
	public void setCollegeCategiry(String collegeCategiry) {
		this.collegeCategiry = collegeCategiry;
	}
	public String getCollegeMobileNum() {
		return collegeMobileNum;
	}
	public void setCollegeMobileNum(String collegeMobileNum) {
		this.collegeMobileNum = collegeMobileNum;
	}
	public char getCollegeGrade() {
		return collegeGrade;
	}
	public void setCollegeGrade(char collegeGrade) {
		this.collegeGrade = collegeGrade;
	}
	public int getCollegeCode() {
		return collegeCode;
	}
	public void setCollegeCode(int collegeCode) {
		this.collegeCode = collegeCode;
	}
	public String getCollegeEmailId() {
		return collegeEmailId;
	}
	public void setCollegeEmailId(String collegeEmailId) {
		this.collegeEmailId = collegeEmailId;
	}
	public int getCollegeStaffStrength() {
		return collegeStaffStrength;
	}
	public void setCollegeStaffStrength(int collegeStaffStrength) {
		this.collegeStaffStrength = collegeStaffStrength;
	}
	
	//toString() method
	@Override
	public String toString() {
		return "CollegeDetails [collegeName=" + collegeName + ", collegeStudentStrength=" + collegeStudentStrength
				+ ", collegeStartDate=" + collegeStartDate + ", collegeAddress=" + collegeAddress + ", collegeCategiry="
				+ collegeCategiry + ", collegeMobileNum=" + collegeMobileNum + ", collegeGrade=" + collegeGrade
				+ ", collegeCode=" + collegeCode + ", collegeEmailId=" + collegeEmailId + ", collegeStaffStrength="
				+ collegeStaffStrength + "]";
	}
	
	
	
}
