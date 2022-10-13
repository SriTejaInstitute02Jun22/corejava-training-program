package com.sriteja.map;

import java.util.*;

public class MapDemoExample {

	//main method
	public static void main(String args[]) {
		new MapDemoExample().setMapObjectDetails();//method calling
	}
	
	private void setMapObjectDetails() {
		
		//creating the map object using HashMap class
		/**
		 * Syntax: 
		 * 			Map<Key_Data_Type, Value_Data_Type> numbers = new HashMap<>();
		 * */
		Map<String, String> bookNames = new HashMap<>();
		//insert some values into map object
		bookNames.put("telugu_sub", "Sumathi Book");
		bookNames.put("hindhi_sub", "Varnamala_Book");
		bookNames.put("english_sub", "Harripoter_Book");
		bookNames.put("matchs_sub", "Progression_Book");
		bookNames.put("scines_sub", "Bioyalogy_Book");
		bookNames.put("social_sub", "Georagraphy_Book");
		//Map.Engtry interface is providing all key and values for that map
		for(Map.Entry<String, String> map : bookNames.entrySet()) {
			System.out.println(map.getKey() +" = "+map.getValue());
		}
	}
}
