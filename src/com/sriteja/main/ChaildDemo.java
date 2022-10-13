package com.sriteja.main;

import com.sriteja.accessmodifier.ParentDemo;

public class ChaildDemo extends ParentDemo{

	public static void main(String args[]) {
		
		//Object creation for child class
		ChaildDemo demo = new ChaildDemo();
		demo.show();
		
		System.out.println(demo);
		System.out.println();
		System.out.println(demo.myProfile);
	}
}
