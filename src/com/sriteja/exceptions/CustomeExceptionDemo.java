package com.sriteja.exceptions;

public class CustomeExceptionDemo {

	public static void main(String args[]) {
		
		String myCompanyName = null;
		int empId = 101;
		
		CustomeExceptionDemo custDemo = new CustomeExceptionDemo();
		String response = custDemo.getCompanyDetails(myCompanyName, empId);
		System.out.println(response);
	}
	
	public String getCompanyDetails(String myCompanyName, int empId) {
		String response = null;
		if((myCompanyName!=null) && empId == 101) {
			System.out.println("My Comapany Name "+myCompanyName);	
			response = "We have a matching data with empid 101";
		}else {
			throw new MyCustomException();
		}
		return response;
	}
}
