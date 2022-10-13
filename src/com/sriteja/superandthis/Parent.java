package com.sriteja.superandthis;

public class Parent {

	public Parent() {
		//System.out.println("Hi Parent Class Constructor.......");
	}
	
	int i = 10;
	String myCompanyName = "CG";
	
	//instance method
	public String getMyComapanyName(String myCompanyName) {
		System.out.println("My Company Name :: "+myCompanyName);
		return myCompanyName;
	}
}
