package com.sriteja.oops;

public class Main extends Demo{

	@Override
	public void show() {
		int a = 10;
		
		System.out.println("Hello.......:: "+a);
		
	}
	
	public static void main(String agrs[]) {
		Demo demo = new Main();
		demo.m();
		demo.show();
	}

}
