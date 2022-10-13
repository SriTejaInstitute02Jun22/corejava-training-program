package com.sriteja.exceptions;

public class ArithmeticException {

	public static void main(String args[]) {
		
		int a = 25;
		int b = 0;
		
		try {
			int  c = b/a;//->0/25 
			System.out.println(c);
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
	}
}
