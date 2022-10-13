package com.sriteja.controlstatements;

public class WhileLoops {

	public static void main(String args[]) {
		
		//instance variable creation
		int a = 10;
		int b = 15;
		
		show(a, b); //static method calling
	}
	
	private static void show(int a, int b) {
		
		/**
		 * Syntax:
		 * 		while(condition){
		 * 			//statement
		 * 		 increment/decrement;
		 * 		}
		 * */
		
		while(a<=b) {
			System.out.println("Ramesh");
			a++;
		}
		System.out.println("Statement execution has completed...");
	}
}
