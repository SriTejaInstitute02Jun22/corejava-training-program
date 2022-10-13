package com.sriteja.basicdetails;

public class Addition {

	//static method
	public static int add(int i, int j) {		
		
		int z = i+j;	//local variable
		
		return z;
	}
	
	//non static method
	public int sub(int i, int j) {
		
		int i1 = j-i;
		return i1;
	}
	
	public static void main(String args[]) {
		
		//instance variable or non static variable creation
		int i=50;	//instance variable
		int j=30;
		
		//method declaration
		int k = add(i,j);	//method calling
		System.out.println("Print the K value : "+k);

		//creating the Addition object
		Addition addition = new Addition();
		
		//sub method
		int k1 = addition.sub(i, j);	//calling the sub method
		System.out.println("Print the K1 value : "+ k1);
				
	}
}
