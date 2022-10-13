package com.sriteja.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String args[]) {
		getTreeMapData();
	//	TreeMapDemo.getTreeMapData();
		
	}
	//static method
	public static void getTreeMapData() {
		
		//creating the map object using TreeMap class
		Map<Integer, String> map = new TreeMap<>();
		map.put(223, "Hi");
		map.put(933, "Hello");
		map.put(633, "Java");
		map.put(673, "Developer");
		System.out.println(map.size());
		System.out.println(map);
	}
}
