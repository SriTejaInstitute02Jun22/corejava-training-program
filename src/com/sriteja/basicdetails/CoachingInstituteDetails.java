package com.sriteja.basicdetails;

public class CoachingInstituteDetails {

	//attribute 
	private String instituteName;
	private String instituteCouseDetails;
	private float instituteFees;
	private String instituteEmailId;
	private String instituteMobileNum;
	private String instituteAddress;
	private int instituteStrength;
	private String instituteTimings;
	private String instituteStartDate;
	
	//setter and getter
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getInstituteCouseDetails() {
		return instituteCouseDetails;
	}
	public void setInstituteCouseDetails(String instituteCouseDetails) {
		this.instituteCouseDetails = instituteCouseDetails;
	}
	public float getInstituteFees() {
		return instituteFees;
	}
	public void setInstituteFees(float instituteFees) {
		this.instituteFees = instituteFees;
	}
	public String getInstituteEmailId() {
		return instituteEmailId;
	}
	public void setInstituteEmailId(String instituteEmailId) {
		this.instituteEmailId = instituteEmailId;
	}
	public String getInstituteMobileNum() {
		return instituteMobileNum;
	}
	public void setInstituteMobileNum(String instituteMobileNum) {
		this.instituteMobileNum = instituteMobileNum;
	}
	public String getInstituteAddress() {
		return instituteAddress;
	}
	public void setInstituteAddress(String instituteAddress) {
		this.instituteAddress = instituteAddress;
	}
	public int getInstituteStrength() {
		return instituteStrength;
	}
	public void setInstituteStrength(int instituteStrength) {
		this.instituteStrength = instituteStrength;
	}
	public String getInstituteTimings() {
		return instituteTimings;
	}
	public void setInstituteTimings(String instituteTimings) {
		this.instituteTimings = instituteTimings;
	}
	public String getInstituteStartDate() {
		return instituteStartDate;
	}
	public void setInstituteStartDate(String instituteStartDate) {
		this.instituteStartDate = instituteStartDate;
	}
	
	//toString() method
	@Override
	public String toString() {
		return "CoachingInstituteDetails [instituteName=" + instituteName + ", instituteCouseDetails="
				+ instituteCouseDetails + ", instituteFees=" + instituteFees + ", instituteEmailId=" + instituteEmailId
				+ ", instituteMobileNum=" + instituteMobileNum + ", instituteAddress=" + instituteAddress
				+ ", instituteStrength=" + instituteStrength + ", instituteTimings=" + instituteTimings
				+ ", instituteStartDate=" + instituteStartDate + "]";
	}
	
	
	
	
	
	
	
}
