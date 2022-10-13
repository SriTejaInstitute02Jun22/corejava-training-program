package com.sriteja.basicdetails;

public class DemoMain {

	//sub method creation 
	public int sub(int i, int j) {	//(10, 20)
		
		int k = i+j; 	//10+20	= 30 
		return k;	//k = 30
		
	}
	
	
	public static void main(String args[]) {
		
		//create the instance variables
		int i = 10;
		int j= 20;
	
		DemoMain demo = new DemoMain();		//Object creation		
		demo.sub(i, j);		//method calling -> (10, 20)
		
		System.out.println("Sub values : "+demo.toString());
	}
}
