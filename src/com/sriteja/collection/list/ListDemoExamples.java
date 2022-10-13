package com.sriteja.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemoExamples {

	public static void main(String args[]) {
		
		new ListDemoExamples().printListOfName();
	}
	
	//instance method
	public void printListOfName() {
		
		//create the List Interface
		List<String> listOfNames = new ArrayList<>();
		//add the values in List Interface
		listOfNames.add("Chandra");//0
		listOfNames.add("Balu");//1
		//listOfNames.add("Ramesh");
		listOfNames.add("Jyothis");//2
		listOfNames.add("Naresh");//3
		listOfNames.add("Shireesha");//4
		
		System.out.println("My Team Names :: "+listOfNames);
		System.out.println("List Size :: "+listOfNames.size());
		System.out.println(listOfNames.remove(2));
		
		System.out.println("After remove the Ramesh Name :: "+listOfNames);
		//System.out.println(listOfNames.removeAll(listOfNames));
		//System.out.println("After removing all Names in the list :: "+listOfNames);
		
		System.out.println("Get the List data :: "+listOfNames.get(4));
		
	}
}
