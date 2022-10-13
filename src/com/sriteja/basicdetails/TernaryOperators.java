package com.sriteja.basicdetails;

public class TernaryOperators {

	public static void main(String args[]) {
		
		//Ternary Opreators
		int x = 8;
		
		System.out.println("Ternary Operators");
		int z = (x>=10) ? 30 : 25;	//(8>=10) ? 30 : 25; => (false) ? 30 : 25; =>output: 25
		System.out.println("Using Ternary Operators print Z value : "+z); //25
	}
}
