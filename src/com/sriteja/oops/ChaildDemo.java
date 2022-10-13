package com.sriteja.oops;

public class ChaildDemo extends ParentDemo{

	
	
	public static void main(String args[]) {
		
		int i = 10;
		
		ChaildDemo cd = new ChaildDemo();
		cd.m();
		cd.show();
		cd.display();
		cd.m(i);
		
		
	}
	
	//overriding
	public void m() {
		System.out.println("Chaild Class m method");
	}
	
	//overloading
	public void m(int i) {
		System.out.println("Oveloading connect and I value is "+i);
	}
}
