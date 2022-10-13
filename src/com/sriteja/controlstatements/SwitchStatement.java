package com.sriteja.controlstatements;

public class SwitchStatement {

	//main method creation
	public static void main(String args[]) {
		
		//String variable creation
		String myName = "Chandra";
		
		//create the static method about Switch Statement logic
		matchingNames(myName);	//method calling
		
	}
	
	//creating static method, matching names
	private static void matchingNames(String myName) {
		
		//creating the switch statement
		System.out.println("enter into the matchingnames method");
		switch(myName) {
		case "Bala":
			System.out.println("My Name is Bala..");
			break;
		case "Naresh":
			System.out.println("My Name is Naresh");
			break;
		case "Sujatha":
			System.out.println("My Name is Sujatha");
			break;
		case "Chandra":
			System.out.println("My Name is Chandra");
			break;
		case "Shireesha":
			System.out.println("My Name is Shireesha");
			break;
		case "Jyothis":
			System.out.println("My Name is Jyothis");
			break;
		default:
			System.out.println("My Name is Ramesh");
		}
	}
}
