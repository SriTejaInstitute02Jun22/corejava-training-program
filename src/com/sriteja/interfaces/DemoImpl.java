package com.sriteja.interfaces;

public class DemoImpl implements DemoInterface{

	@Override
	public void get() {
		System.out.println("This is get method in Demo Imple class");
	}

	@Override
	public void show() {
		
		System.out.println("Hello Demo Interface");
	}

	
}
