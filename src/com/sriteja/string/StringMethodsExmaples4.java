package com.sriteja.string;

public class StringMethodsExmaples4 {

	public static void main(String args[]) {
		
		String empName = "Naresh Kumar";
		String empDept = "Manager";
		
		StringMethodsExmaples4 str = new StringMethodsExmaples4();
		str.checkDetails(empName, empDept); //non static method calling
	}
	
	//creating non static method
	private void checkDetails(String empName, String empDept) {
		//length(), replace(), toLowerCase(), toUpperCase()
		
		System.out.println(empName.length());
		System.out.println(empDept.replace("Manager", "IT"));
		System.out.println(empName.toLowerCase());
		System.out.println(empName.toUpperCase());
		
	}
	
}
