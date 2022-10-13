package com.sriteja.basicdetails;

public class BasicJavaDetails {

	//syntax for how to create the static variable
	//syn:- static data_type variabl_name = value;
	static int s = 100;	//static variable
	
	final String myName = "Ramesh";//final variable
	
	
	//method creation
	void show() {
		
		//syn:- data_type variabl_name = value;
		int j = 300;	//local variable
		
		System.out.println("Print the value into Show method "+j);
	}
	
	
	public static  void main(String args[]) {	//main method
		
		
		//syn:- data_type variabl_name = value;
		int i = 10;		//instance variable
		String myFriendName = "Naresh";	//non primative type
		
		System.out.println(myFriendName);
		
		System.out.println("Values I "+i);	//Print method
		
		String myName = "Ramesh";	//syn:- data_type variabl_name = value;
		
		System.out.println("My Name is "+myName);
		
	}
}
