package com.sriteja.controlstatements;

public class NestedForLoop {

	public static void main(String args[]) {
		
		//instance variables
		int a = 4;
		int b = 3;
		
		NestedForLoop nestedForLoop = new NestedForLoop();
		nestedForLoop.showNestedForLoop(a, b); //non static method calling
	}
	
	private void showNestedForLoop(int a, int b) {
		
		System.out.println("A :: "+a);
		System.out.println("B :: "+b);
		
		/**
		 * Syntax:
		 * 			for(initialization; condition ;increment/decrement){
		 * 				for(initialization; condition ;increment/decrement){	//inner for loop
		 * 					//statement
		 * 				}
		 * 			}
		 * */
		for(int i=0; i<=a; i++) {
			for(int j=0; j<=b; j++) {
				System.out.println(i+", "+j);
			}
		}
	}
}
