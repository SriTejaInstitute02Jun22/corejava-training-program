package com.sriteja.main;
//create the new Java class
/**
	Syntax: 
	access_modifier class_keyword class_name{
		
	}
	Note: every class it can start with Capital letter.
*/

import com.sriteja.bean.Mobile;

public class MobileMain {

	
	
	private final static String myCompanyName = "Capgemini";
	
	
	//creating main method
		/**
			Syntax:
			access_modifier static_keyword return_type method_name(parameters){
				//Method body
			}
		*/
		//this is static method and is called main method also
	public static void main(String args[]) {
		
		//Object creation
		/**
		 * 	Syntax:
		 * 	class_name object_name = new class_name();
		 * 
		 * */
		MobileMain mobileMain = new MobileMain();
		mobileMain.setMobileData();	//instance method calling(non static method)
		
		//using setter method to assign the values into mobile object
		String response = mobileMain.setMobileDataWithSetterMethods(); //method calling
		
		System.out.println("=================================");
		System.out.println("Response :: "+response);
		
		
		MobileMain.get();
	}
	
	//instance method
	private void setMobileData() {
		
		/*
		 * //Mobile Object creation //parameterized constructor using to assign the
		 * values into Mobile Object Mobile mobile = new Mobile("Samsung", "Block",
		 * 15000.0f, "4G", "Intel", "15mega", true);
		 * //System.out.println("Mobile Data :: "+mobile);
		 */	}
	
	
	public String setMobileDataWithSetterMethods() {
		//Mobile  object creation
		Mobile mobile = new Mobile();
		mobile.setMobileName("Samsung");
		mobile.setMobileColor("Red");
		mobile.setMobilePrize(12500.50f);
		mobile.setMobileRam("4gb");
		mobile.setMobileProcesser("Intel");
		mobile.setMobileCemera("14Mega");
		mobile.setMobileWifi(true);
		
		System.out.println("Mobile Data :: "+mobile);
		
		String mobileIntialization = "Mobile data intialization is Successfully completed";
		
		return mobileIntialization;
	}
	
	private static void get() {
		
	}
}
