package com.sriteja.basicdetails;

public class UnaryOperators {

	public static void main(String args[]) {
		
		//Unary Operators are -, ++, --
		int x=10;
		/* increment operation*/
		//postfix : first operation and then increment
		System.out.println(x++); //10
		//11
		
		System.out.println(x);//11
		System.out.println();
		
		//prefix : increment and then perform some operation
		System.out.println(++x);//++11 => 12
		//12
		System.out.println(x); //12
		
		System.out.println("==========================");
		
		int z = 20;
		//postfix
		System.out.println(z++);//20
		//21
		System.out.println(z);//21
		
		//prefix
		System.out.println(++z);//21+1 = 22
		//z=22
		System.out.println(z);//22
		
		/* end increment operation*/
		
		
		/* decrement operation examples*/
		System.out.println("decrement operation examples");
		int age = 20;
		//postfix : first operation and then decrement
		System.out.println(age--);//20
		//19
		System.out.println(age);//19
		System.out.println();
		
		//prefix : decrement and then perform some operation
		System.out.println(--age);//18
		System.out.println(age);//18
	}
}
