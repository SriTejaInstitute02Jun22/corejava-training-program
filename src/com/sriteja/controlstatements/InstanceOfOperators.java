package com.sriteja.controlstatements;

public class InstanceOfOperators extends Demo{

	public  static void main(String args[]) {
		
		InstanceOfOperators instOfOper = new InstanceOfOperators();
		boolean b = instOfOper instanceof Demo;
		
		System.out.println("Checking the Instaance Of Operator :: "+b);
		
		
		TernaryOperaters ternaryOp = new TernaryOperaters();
		boolean b1 = ternaryOp instanceof Object;
		System.out.println("B1 :: "+b1);
	}
}
