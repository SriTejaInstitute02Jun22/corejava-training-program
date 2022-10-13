package com.sriteja.main;

import com.sriteja.bean.CollegeDetails;

public class CollegeDetailsMain {

	//main method
	public static void main(String args[]) {
		
		//College Details Object creation
		CollegeDetails college = new CollegeDetails();
		college.setCollegeName("Sri Chaitanya");
		college.setCollegeStudentStrength(1000);
		college.setCollegeStartDate("01-Jan-22");
		college.setCollegeAddress("Tanakallu, Kadiri (Dist");
		college.setCollegeCategiry("Intermediate");
		college.setCollegeMobileNum("+918973334454");
		college.setCollegeGrade('A');
		college.setCollegeCode(253845);
		college.setCollegeEmailId("shirisha@chaitanya.com");
		college.setCollegeStaffStrength(30);
		
		System.out.println("Shirisha College Details :: "+college);
		System.out.println();
		
		System.out.println("Shirisha College Name : "+college.getCollegeName());
		System.out.println("Shirisha College Email Id : "+college.getCollegeEmailId());
		System.out.println("Shirisha College Mobile Number : "+college.getCollegeMobileNum());
		
		
	}
}
