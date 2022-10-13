package com.sriteja.collection.list;

import java.util.ArrayList;
import java.util.List;

import com.sriteja.bean.Address;

public class GetAddressDetails {

	//create the main method
	public static void main(String args[]) {
		
		//GetAddressDetails get =  new GetAddressDetails();
		//List<Address> addressDetails= get.setAddressDetails();
		
		
		List<Address> addressDetails = new GetAddressDetails().setAddressDetails();
		System.out.println(addressDetails);
		
		
	}
	
	//instance method to get the Address details
	public List<Address> setAddressDetails() {
		
		//create the list object to set the address details into that list Object
		List<Address> listOfAddress = new ArrayList<Address>(); 
		
		//Create the Address Object
		Address primaryAddress = new Address();
		primaryAddress.setHouseNum(73);
		primaryAddress.setColonyName("Jai Jawan Colony");
		primaryAddress.setStreetName("Kapra");
		primaryAddress.setPinCode(3434343);
		primaryAddress.setLandMark("Near SBI Bank");
		
		//Create the Secondary Address
		Address secondaryAddress = new Address();
		secondaryAddress.setHouseNum(82);
		secondaryAddress.setColonyName("Jawahar Nagar");
		secondaryAddress.setStreetName("Naresh Streat");
		secondaryAddress.setPinCode(8723434);
		secondaryAddress.setLandMark("Near Stack");
		
		//use add() method to insert the values into List Object
		listOfAddress.add(primaryAddress);
		listOfAddress.add(secondaryAddress);
		
		return listOfAddress;
	}
}
