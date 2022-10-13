package com.sriteja.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//how to sort the list object.
public class SortArrayListObject {

	public static void main(String args[]) {
		
		new SortArrayListObject().sortListOfName();
		
		//iterate the list of values
		List<Integer> listOfValues = new ArrayList<Integer>();
		listOfValues.add(23);//0
		listOfValues.add(344);//1
		listOfValues.add(903);//2
		listOfValues.add(743);//3
		
		System.out.println(listOfValues.get(2));
		System.out.println(listOfValues.get(1));
		System.out.println(listOfValues.get(3));
		System.out.println(listOfValues.get(4));
		
		System.out.println("===============================");
		//iterate the list of values using for-each method
		for(Integer i : listOfValues) {
			System.out.println("Id :: "+i);
		}
		
		System.out.println("java 8 features ====================");
		//java 8 feature
		listOfValues.stream().forEach(System.out::println);
	}
	
	//create the instance method
	public void sortListOfName() {
		
		//create list object
		List<String> listOfNames = new ArrayList<>();
		//add some values in the list
		listOfNames.add("Venkat");
		listOfNames.add("Balu");
		listOfNames.add("Chandra");
		listOfNames.add("Naresh");
		
		//to sort the list of Object
		Collections.sort(listOfNames);
		
		/**
		 * Syntax: 
		 * 		for(Data_Type value : arrays/collections){
		 * 
		 * 		}
		 * */
		System.out.println("Print the Names in sorting Order");
		for(String names : listOfNames) {
			System.out.println(names);
		}
		
	}
}
