package com.sriteja.main;

import com.sriteja.bean.Laptop;

public class LaptopMain {

	
	public static void main(String args[]) {
		
		//creating the Laptop Object
		Laptop laptop = new Laptop();
		laptop.setLaptopName("Lenova");
		laptop.setColour("Block");
		laptop.setHardDisk("500gb");
		laptop.setRam("4gb");
		laptop.setGrapicks(true);
		laptop.setPorts(4);
		laptop.setBateryBackup("4hr");
		
		System.out.println("My Laptop Details :: "+laptop); //print the laptop values
		
		System.out.println("Laptop Name : "+laptop.getLaptopName());
		
		System.out.println("Laptop Ram Size : "+laptop.getRam());
		
		
	}
}
