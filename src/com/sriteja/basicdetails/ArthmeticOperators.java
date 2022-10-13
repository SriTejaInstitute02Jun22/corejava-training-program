package com.sriteja.basicdetails;

public class ArthmeticOperators {
	
	//creating main method
	public static void main(String args[]) {
		int j = 10;
		int k =45;
		
	//object creation syntax: Object_Name/Class_name variable_name = Object_name/Class_name();
		
	ArthmeticOperators arthOperator = new ArthmeticOperators();
	int z = arthOperator.add(k, j);
	
	int z1 = arthOperator.sub(j, k);
	
	int z3 = arthOperator.div(20, 7);
	
	int z4 = arthOperator.mul(10, 20);
	
	System.out.println("Print the Z values "+z);
	System.out.println("Print the Z1 values "+z1);
	System.out.println("Print the Z3 values "+z3);
	System.out.println("Print the Z4 values "+z4);
	
	System.out.println("Print the % values "+12%10);
	
	}

	//non static method
	private int mul(int i, int j) {

		return i*j;
	}

	//non static method
	private int div(int i, int j) {
		
		return i/j;
	}

	//non static method
	private int sub(int j, int k) {
		
		return j-k;
	}

	//non static method
	private int add(int k, int j) {
		
		return k+j;
	}
}
