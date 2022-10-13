package com.sriteja.controlstatements;

public class NestedIfStatement {
	
	//non static method
	@SuppressWarnings("unused")
	public void output(int s, int z) {
		if(s>z) {
			
			System.out.println("if block statement inside the method level");
			
			if(60<100 && 12>10) {
				System.out.println("inner if block statement inside the method level ");
			}else {
				System.out.println("else block statement inside the method level ");
			}
			
		}else {
			System.out.println("else block inside the output method");
		}
	}

	//main method
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		
		//create the instance variable
		int s = 30;
		int z = 50;
		
		//create nested if statement
		if(s<z) {
			System.out.println("if statement is true........");
			
			if(20>10) {
				System.out.println("inner if statement is ture....");
			}else {
				System.out.println("inner if statement is false");
			}	
		}else {
				System.out.println("if statement is false so that else is printing.....");
		}
		
		System.out.println("============================================");
		//creating Object for current class
		NestedIfStatement nestedIfStatement = new NestedIfStatement();
		nestedIfStatement.output(s, z);	//non static method calling
		
	}
}
