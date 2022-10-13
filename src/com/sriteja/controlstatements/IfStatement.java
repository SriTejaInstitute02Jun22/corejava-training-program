package com.sriteja.controlstatements;

public class IfStatement {

	//main method
	public static void main(String args[]) {
		
		//variable declarations
		int a = 10;
		int b = 30;
		
		//if statement
		if(a<b) {	//10<30 => true
			System.out.println("If Statement condition is true");
		}
		
		//System.out.println("I am good");
		
		//if statement with false condition
		if(a>b) {	//10>30  => false
			System.out.println("If statement is true so I am print");
		}
		
		System.out.println("Ending");
	}
}
