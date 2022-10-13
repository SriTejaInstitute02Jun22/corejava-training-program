package com.sriteja.basicdetails;

public class OperatorsExamples {

	public static void main(String args[]) {
		
		int i = 5;
		
		System.out.println(i);	//5
		
		//postfix
		//first operator then increment
		System.out.println(i++); //5
			//i+1 => 5+1 =>6
		System.out.println(i); //6
		
		//prefix
		//first increment then some operator
		System.out.println(++i); //i+1 => 6+1 = 7
			//i=i =>i=7
		System.out.println(i); //7
		
	}
}
