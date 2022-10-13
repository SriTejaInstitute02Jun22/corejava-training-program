package com.sriteja.superandthis;

public class Chaild extends Parent{

	String myCompanyName = "HCL";
	
	public Chaild() {
		super();
		//System.out.println("This is Chaild class Constructor");
	}
	
	public Chaild(int id, String myName) {
		System.out.println("Chaild Class Parameterized Cunstructor...");
		this.myId = id;
		this.myName = myName;
		System.out.println(myId+" and "+myName);
	}
	
	int myId;
	String myName;
	
	//instance method
	public void getMyNameAndMyIdAndMyCompanyName(String myName, int  myId) {
		System.out.println("My Name is :: "+myName+ " and My Id :: "+myId);
		System.out.println("My Chaild Company Name:: "+this.myCompanyName);
		System.out.println("My Parent Company Name:: "+super.myCompanyName);
	}
	
	public static void main(String args[]) {
		//new Chaild(100, "CRB");
		//System.out.println("======================================");
		//new Chaild();
		
		new Chaild().getMyNameAndMyIdAndMyCompanyName("C.Ramesh", 9000);
		
	}
}
