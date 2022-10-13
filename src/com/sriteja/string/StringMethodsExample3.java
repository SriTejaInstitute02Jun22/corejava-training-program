package com.sriteja.string;

public class StringMethodsExample3 {

	public static void main(String args[]) {
		
		String s = "Hello";
		String s1 = "Hello";
		String s2 = "RameshBabu";
		String s3 = "rameshbabu";
		String s4 = "Hi";
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		checkTwoStringValues(s, s1); //static method calling
		
		StringMethodsExample3 str = new StringMethodsExample3();
		str.checkStringValues(s, s2, s3, s4); //non static method calling
		
	}
	
	//static method creation
	private static void checkTwoStringValues(String s, String s1) { //static method creation
		
		if(s.equals(s1)) {
			System.out.println("S and S1 both are having same data...");
		}else {
			System.out.println("S and S1 both are not having same data...");
		}
	}
	
	//non static method creation
	private void checkStringValues(String s, String s2, String s3, String s4) {
		
		if(s.equals(s4)) {
			System.out.println("S and S4 both are having same data...");
		}else if(s2.equalsIgnoreCase(s3)) {
			System.out.println("S3 and S4 both are having same data...");
		}else {
			System.out.println("No matching data...................");
		}
		
	}
}
