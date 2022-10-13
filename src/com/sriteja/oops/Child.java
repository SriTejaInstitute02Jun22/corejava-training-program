package com.sriteja.oops;

public class Child extends Father{

	
	public static void main(String args[]) {
		
		//inheritance 
		//GrandFather and Father both are parent class to Child class
		
		GrandFather gf = new Child();
		gf.show(10);
		gf.get(80);
		
		Father father = new Child();
		father.display();

	}
	//Overriding
	public void get(int i) {
		System.out.println("Display the I value from Chaild Class :: "+i);
	}
}
