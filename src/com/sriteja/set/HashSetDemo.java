package com.sriteja.set;

import java.util.HashSet;
import java.util.Set;

/***
 * This class is implementing to create HashSet functional
 * HashSet:- While adding the element into HashSet, is insertion order doesn’t follow and duplicate elements are not allowed.


 * */
public class HashSetDemo {

	public static void main(String args[]) {
		
		//HashSetDemo.getLaptopDetails();
		getLaptopDetails();
	}
	
	//static method creation
	public static void getLaptopDetails() {
		
		//creating the set interface using HashSet implementation class
		Set<String> laptopNames = new HashSet<>();
		
		//inserting some values into Set object
		laptopNames.add("Lenova");
		laptopNames.add("HP");
		laptopNames.add("Samsung");
		laptopNames.add("Accer");
		laptopNames.add("Dell");
		laptopNames.add("HP");
		laptopNames.add(null);
		laptopNames.add("Dell");
		
		for(String laptopName : laptopNames) {
			System.out.println("Laptop name :: "+laptopName);
		}
		
		if(laptopNames.contains("LG")) {
			System.out.println("I have a HP laptop...........");
		}else {
			System.out.println("I don't have a HP laptop...");
		}
		
	}
}
