package com.sriteja.string;

public class StringMethodsExample2 {

	
	public static void main(String args[]) {
		
		//concat() method
		String str = "Balu";
		System.out.println(str); //Balu
		
		String str1 = str.concat("Raju");
		System.out.println(str1); //BaluRaju
		
		//contain() method
		StringMethodsExample2 s = new StringMethodsExample2();
		s.show(str1);
		
	}
	
	private void show(String str1) {
		
		if(str1.contains("Rajubabu")) {
			System.out.println("Yes Raju name is available.....");
		}else {
			System.out.println("Yes Raju name is not available.....");
		}
	}
	
}
