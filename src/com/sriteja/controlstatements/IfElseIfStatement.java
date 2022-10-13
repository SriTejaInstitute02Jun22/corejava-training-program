package com.sriteja.controlstatements;

public class IfElseIfStatement {
	
	 //non-static method
	 public int get(int i, int j) {
		 
		 //local variable declaration
		 int s;
		 
		 //if-else-if statement
		 if(i<=j || i==j) {
			 s = i+j;
			 System.out.println("First If condition is true, S = "+s);
		 }else if(i<j && j>i){
			 s = i-j;
			 System.out.println("First else if condition is ture, S = "+s );
		 }else if(20>21) {
			 s = i+j;
			 System.out.println("Second else if condition is true, S = "+s);
		 }else {
			 s = i-j;
			 System.out.println("All if and else if condition not ture, S = "+s);
		 }
		 
		 return s;
	 }

	//main method
	public static void main(String args[]) {
		
		//instance variable declaration
		int i = 12;
		int j = 30;
		
		//object creation for current class
		IfElseIfStatement ifElseIfStatement = new IfElseIfStatement();
		
		int k = ifElseIfStatement.get(i, j);	//method calling
		
		System.out.println("Main method K value is "+k);
	}
}
