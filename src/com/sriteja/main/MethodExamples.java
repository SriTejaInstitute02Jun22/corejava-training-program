package com.sriteja.main;

public class MethodExamples {

	public static void main(String args[]) {
		
		int rollNum = 101;
		String name = "Chandra";
		
		MethodExamples method =new MethodExamples();
		method.display(); //non static method calling
		
		//parameterized method calling
		method.display(rollNum, name);
	}
	
	private void display() {
		
		System.out.println("Hi Chandra...........");
	}
	
	private void display(int rollNum, String name) {
		
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollNum);
	}
}
