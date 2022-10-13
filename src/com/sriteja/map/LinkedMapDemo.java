package com.sriteja.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedMapDemo {

	public static void main(String args[]) {
		getLinkedHashMapData();
	}
	//static method
	public  static void getLinkedHashMapData() {
		
		//creating the map object using LinkedHashMap class
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(221, "Chandra");
		map.put(244, "Dhanavi");
		map.put(983, "Pandhu");
		map.put(344, "Janaki");
		map.put(983, "Hi");
		
		for(Map.Entry<Integer, String> m: map.entrySet()) {
			System.out.println(m);
	}
		
	}
}
