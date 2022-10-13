package com.sriteja.oops;

public class Father extends GrandFather{

	public  void display() {
		System.out.println("Hi Team - message getting in Father Class");
	}
	
	public static void main(String args[]) {
		
		GrandFather gFather = new Father();
		gFather.show(9);
		gFather.get(15);
	}
}
