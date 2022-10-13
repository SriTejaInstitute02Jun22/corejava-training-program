package com.sriteja.main;

public class OperatorsDemo {

	String myName = "Ramesh Babu";
	
	//creating main method
	public static void main(String args[]) {
		
		//instance variables
		int i = 10;
		boolean laptop = true;
		int j = 25;
		char surName = 'C';
		
		int add = addition(i, j);//(10, 25)  //static calling
		System.out.println("Addition Value :: "+add);
		
		//Object creation
		OperatorsDemo demo = new OperatorsDemo();
		String s = demo.multiplicateOperators(i, j);			//instance method calling (parameterized method)
		System.out.println("My Name is :: "+s);
	}
	
	private static int addition(int i, int j) {	 //(10,25)	//method creation or method declration
		
		int a = i+j;	//a = 10+25 =>35;
		
		return a;
	}
	
	
	private String multiplicateOperators(int i, int j) {
		
		int mul = i*j;
		System.out.println("Multiplication :: "+mul);
		
		int div = j%i;
		System.out.println("Division :: "+div);
		
		String str = myName;
		return str;
	}
}
