package com.sriteja.arrays;

public class BooksMain {

	//main method
	public static void main(String args[]) {
		
		//BooksMain books = new BooksMain();
		//books.displayBookName();
		
		new BooksMain().displayBookName();
	}
	
	//instance method
	public void displayBookName() {
		//create the arrays 
		String books[] = new String[5];
		books[0] = "Java Book";
		books[1] = "Spring Book";
		books[2] = "MicroService Book";
		books[3] = "WebSerices Book";
		books[4] = "Design Patterns";
		
		System.out.println("Book Details :: "+ books.toString());
		System.out.println("1st Book Name :: "+ books[0]);	
		System.out.println("4st Book Name :: "+ books[3]);
		
		System.out.println("Size of the Book array :: "+books.length);
		
	}
	
	
}
