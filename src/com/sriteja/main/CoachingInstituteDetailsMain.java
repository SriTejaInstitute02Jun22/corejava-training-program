package com.sriteja.main;

import com.sriteja.bean.CoachingInstituteDetails;

public class CoachingInstituteDetailsMain {

	//create the static method
	/**
	 * Syntax: access_modifer static_keyword return_type method_name(){
	 * 				method body
	 * 			}
	 * */
		//Step 1: I want to create one method (static).
		private static void setInstituteDetails() {
			
			//Create the Object for CoachingInstituteDetails
			/**
			 * 	Systax: class_name object_name = new class_name();
			 * */
			//Step 2: I want to crate one Object for the CoachingInstituteDetails class in side the same method.
			CoachingInstituteDetails coaching = new CoachingInstituteDetails();
			
			//Step 3: Initialize the values for that Object.
			coaching.setInstituteName("Sri Teja Institute");
			coaching.setInstituteCouseDetails("Java and Automation Testing");
			coaching.setInstituteFees(24999.99f);
			coaching.setInstituteEmailId("ramesh96420@gmail.com");
			coaching.setInstituteMobileNum("+918801826101");
			coaching.setInstituteAddress("Kokkanti Cross");
			coaching.setInstituteStrength(8);
			coaching.setInstituteTimings("Every Day at 7:30PM to 9:30PM");
			coaching.setInstituteStartDate("02-Jun-22");
			
			//Step 4: Print that Object inside that method itself.
			System.out.println("Sri Teja Institute Details");
			System.out.println(coaching);
			
		}
	
	
	//main method
	public static void main(String args[]) {
		
		/*
		 * 1. I want to create one method (static).
		 * 2. I want to crate one Object for the CoachingInstituteDetails class in side the same method.
		 * 3. Initialize the values for that Object.
		   4. Print that Object inside that method itself.
		*/
		
		setInstituteDetails();	//static method calling
		
		//create the non static method or instance method
		CoachingInstituteDetailsMain coachingInstitute = new CoachingInstituteDetailsMain();
		CoachingInstituteDetails  response = coachingInstitute.getInstituteDetails();	//non static method calling
		System.out.println();
		System.out.println("My Institute Details :: "+response);
		System.out.println();
		
		System.out.println("=======================================");
		System.out.println("Institute Name :: "+response.getInstituteName());
		System.out.println("Mobile Number :: "+response.getInstituteMobileNum());
		System.out.println("Email Id :: "+response.getInstituteEmailId());
		System.out.println("Institue Address :: "+response.getInstituteAddress());
		
		
		
	}
	
	
	//get the values such as institute name, mobile, email and address about Coaching Institute 
	//creating non static method
	/**
	 * Syntax:
	 * 			access_modifer return_type method_name(){
	 * 				//method body
	 * 				
	 * 				return retrun_type;
	 * 			}
	 * */
	private CoachingInstituteDetails getInstituteDetails() {	//method declaration
		
		//create the CoachingInstituteDetails Object
		CoachingInstituteDetails getInstituteDetails = new CoachingInstituteDetails();
		getInstituteDetails.setInstituteName("Sri Teja Institute");;
		getInstituteDetails.setInstituteMobileNum("+918801826101");
		getInstituteDetails.setInstituteEmailId("ramesh96420@gmail.com");
		getInstituteDetails.setInstituteAddress("33-1 Kokkanti Cross");
		
		return getInstituteDetails;
		
	}
	
	
	
	
	
}
