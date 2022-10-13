package com.sriteja.arrays;

public class ForLoopArray {

	public static void main(String args[]) {
		
		//ForLoopArray arr = new ForLoopArray();
		//arr.getLaptopNames();
		
		new ForLoopArray().getLaptopNames();
	}
	
	//creating the instance method to create the array
	//I want to print some laptop name using array concept 
	public  void getLaptopNames() {
		String laptopName[] = new String[5];
		laptopName[0] = "Lenova";
		laptopName[1] = "HP";
		laptopName[2] = "Dell";
		laptopName[3] = "ACCS";
		laptopName[4] = "MSI";
		
		System.out.println("3rd Laptop company Name :: "+laptopName[2]);

		//for loop 
		for(int i=0; i<laptopName.length; i++) {
			System.out.println("Display the top level Laptop name :: "+laptopName[i]);
		}
		System.out.println("===================================");
		//for each loop
		for(String lName:laptopName) {
			System.out.println("Laptop Name :: "+lName);
		}
		
	}
}
