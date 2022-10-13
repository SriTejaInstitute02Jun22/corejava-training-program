package com.sriteja.basicdetails;

public class BitwiseOperators {

	public static void main(String args[]) {
		
		//variable declarations
		boolean i = false;
		boolean j = true;
		System.out.println("Bitwise exclusive OR (^)");
		System.out.println(i^j);	//true
		
		System.out.println(false^false);	//false
		System.out.println(j^i);			//true
		System.out.println(true^true);		//false
		
		System.out.println("Bitwise Complement (~)");
		//System.out.println(~true);
		
	}
}
