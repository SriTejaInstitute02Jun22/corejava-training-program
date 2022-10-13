package com.sriteja.controlstatements;

public class TernaryOperaters {

	// creating main method
	public static void main(String args[]) {
		// instance variable
		int i = 20;
		int k = 35;

		// ternary operator
		String j = (i >= k) ? "Ramesh" : "Naresh";
		System.out.println("Ternary Operator  output : " + j);

		System.out.println("==========================");
		String englishBook = "HarryPorter";
		// int d =10;
		// multiple condition check using ternary operator
		String resBookNames = (englishBook.equalsIgnoreCase("harryporter"))
				? (k >= i) ? "Spoken English Book Name" : "Maths Book"
				: "no matching books";

		System.out.println("Inner if loop if output :: " + resBookNames);

		System.out.println();
		String res1 = (englishBook.equalsIgnoreCase("harryporter"))
				? (k < i) ? "Spoken English Book Name" : "Maths Book"
				: "no matching books";

		System.out.println("Inner if loop else output :: " + res1);

		System.out.println();
		String res2 = (englishBook.equalsIgnoreCase("my auto biography"))
				? (k < i) ? "Spoken English Book Name" : "Maths Book"
				: "no matching books";

		System.out.println("else output :: " + res2);
		
		System.out.println();
		int a = 100;
		String res3 = (a <= 10 || a == 100)
				? (a == 100 && englishBook.equalsIgnoreCase("harryporter")) ? "Spoken English Book Name" : "Maths Book"
				: "no matching books";

		System.out.println("integer inner if output :: " + res3);

	}
}
