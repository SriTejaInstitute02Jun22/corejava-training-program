package com.sriteja.string;

public class IneterViewQuestion1 {

	public static void main(String args[]) {
		
		String s = "Good";
		String s1 = "Good";
		
		if(s==s1) {
			System.out.println("It is creating inside S.C.P");
		}else {
			System.out.println("It is creating inside Heap");
		}
		
		
		String str = new String("Good");
		String str1 = new String("Good");
		
		System.out.println(s==str);		//false
		System.out.println(str==str1);	//false
		System.out.println(str.equals(str1)); //true
		
		
	}
}
