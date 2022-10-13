package com.sriteja.accessmodifier;

public class ParentDemo {

	protected String myProfile = "Team Lead";
	
	protected void show() {
		System.out.println("This is Parent Class..");
	}
	
	//creating main method
	public static void main(String args[]) {
		
		//creating the Demo Object
		Demo demo = new Demo();
		demo.myDetails();
	}
}
