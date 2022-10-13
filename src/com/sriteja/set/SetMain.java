package com.sriteja.set;

import java.util.*;


public class SetMain {

	
	//creating the main method
	public static void main(String args[]) {
		
		
		//how to create the Object to current class
		/*
		 * Syntax: to create Object for the class
		 * 		Class_name variable_name = new Class_name();
		 * */
		SetMain s1 = new SetMain();
		s1.setCompanyDetails();
		s1.setCompanyDetailsWithList();
		
		//new SetMain().setCompanyDetails();
	}
	
	//creating instance method to set the values into Set interface.
	public void setCompanyDetails() {
		
		
		/*
		 * Syntax:- 
		 * Interface_Name<Data_type/User Object> variable_Name = new Implementaion_Class_Name<>();
		 */
		//creating the Set object
		Set<String> companyDetails = new HashSet<>();
		
		//insert the values into Set interface
		companyDetails.add("HCL");
		companyDetails.add("Wipro");
		companyDetails.add("Sutherland");
		companyDetails.add("Infosys");
		companyDetails.add("HSBC");
		companyDetails.add(null);
		companyDetails.add(null);
		companyDetails.add(null);
		companyDetails.add("Wipro");
		
		System.out.println("Set Interface working flow..............");
		//to iterate the set object or print the set object using for each loop
		for(String comapanyName :companyDetails) {
			System.out.println("Comapany Name :: "+comapanyName);
		}
		
		
	}
	
	//Using List Interface to print the Company Details.
		public void setCompanyDetailsWithList() {
			
			
			/*
			 * Syntax:- 
			 * Interface_Name<Data_type/User Object> variable_Name = new Implementaion_Class_Name<>();
			 */
			//creating the Set object
			List<String> companyDetails = new ArrayList<>();
			
			//insert the values into Set interface
			companyDetails.add("HCL");
			companyDetails.add("Wipro");
			companyDetails.add("Sutherland");
			companyDetails.add("Infosys");
			companyDetails.add("HSBC");
			companyDetails.add(null);
			companyDetails.add(null);
			companyDetails.add(null);
			companyDetails.add("Wipro");
			
			System.out.println("List Interface working flow..............");
			//to iterate the set object or print the set object using for each loop
			for(String comapanyName :companyDetails) {
				System.out.println("Comapany Name :: "+comapanyName);
			}
			
			
		}
	
}
