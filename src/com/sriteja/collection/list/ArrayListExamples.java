package com.sriteja.collection.list;

//import java.util.ArrayList;
//import java.util.List;

import java.util.*;

public class ArrayListExamples {

	//main method
	public static void main(String args[]) {
		
		//create the Object for Current Class
		ArrayListExamples bookNames = new ArrayListExamples();
		bookNames.setBookNames();
		
		
	}
	
	//instance method or non static method
	public  void setBookNames() {
		
		//creating the list of books using List Interface and ArrayList class
		//creating the List object
		List<String> listOfBooks = new ArrayList<>();
		//insert values into list object using add() method
		listOfBooks.add("Java Book");
		listOfBooks.add("Spring Book");
		listOfBooks.add("Microservice Book");
		listOfBooks.add("Spring Rest API Book");
		listOfBooks.add("Spring Boot Book");
		
		//print the list object
		System.out.println("Book of List Object :: " +listOfBooks);
	}
	

	
	
}
