package com.sriteja.controlstatements;

public class DoWhileLoops {

	public static void main(String args[]) {
		
		int i=12;
		int j=13;
		boolean b = true;
		
		DoWhileLoops doWhileLoops = new DoWhileLoops();
		String a = doWhileLoops.getResult(i, j);//method calling
		System.out.println("Pring A value = "+a);
		
		System.out.println();
		boolean t = show(b,j); //static method calling
		System.out.println("Boolean T value = "+t);
	}
	
	private String getResult(int i, int j) {
		 //System.out.println("I = "+i+ " J = "+j);
		 
		 String myPorject = "Transport";
		 /**
		  * Syntax:
		  * 	do{
		  * 		//statement;
		  * 	increment/decrement;
		  * 	}while(condition);
		  * */
		do {
			//System.out.println("Hi Team...");
			i--;
		}while(i>j);
		
		return myPorject;
		
	}
	
	private static boolean show(boolean b, int j) {
		
		do {
			System.out.println("I have a laptop :: "+b);
			j++;
		}while(j<14);
		
		return b;
	}
}
