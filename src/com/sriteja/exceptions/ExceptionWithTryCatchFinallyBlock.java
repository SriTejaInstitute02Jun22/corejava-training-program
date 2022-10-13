package com.sriteja.exceptions;

public class ExceptionWithTryCatchFinallyBlock {
	
	public static void main(String  args[]) {
		int i = 10;
		String myName = "Naresh";
		
		try {
			
		String  name = m1(i, myName);//static method calling
		System.out.println("Sucessfully................"+name);
		}catch(NullPointerException ex) {
			System.out.println("My Name is not available in this code");
		}finally {
			System.out.println("Program is end........");
		}
	}
	
	//method creation 
	public static String m1(int i, String myName) {
		if(myName.contains("Naresh")) {
			System.out.println("My Name:: "+myName);
		}		
		return myName;
	}
}
