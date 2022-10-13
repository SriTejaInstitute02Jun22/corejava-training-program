package com.sriteja.map;

import java.util.HashMap;
import java.util.Map;

import com.sriteja.bean.Address;
import com.sriteja.bean.Employee;

public class MapExample4 {

	public static void main(String args[]) {
		new MapExample4().display();
		new MapExample4().getMapDetails();
		new TreeMapDemo().getTreeMapData();
	}
	
	private void display() {
		
		Map<String, Object> map = new HashMap<>();
		map.put("1st", 10);
		map.put("2nd", "Hi");
		map.put("3rd", getEmployeeData());
		map.put("4th", getAddressDetails());
		
		try {
			for(Map.Entry<String, Object> data : map.entrySet()) {
				System.out.println(data);
			}
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}
	
	//get Employee Object
	private Employee getEmployeeData() {
		Employee employee = new Employee();
		employee.setEmpName("Chandra");
		employee.setEmpId("C1221");
		employee.setEmpDept("IT");
		employee.setEmpSalary(50000.10);
		employee.setEmpJoiningDate("01-Jan-22");
		employee.setEmpDeign("Sr.Software Engineer");
		return employee;
	}
	
	//get Address Object
	private Address getAddressDetails() {
		
		Address primaryAddress = new Address();
		primaryAddress.setHouseNum(73);
		primaryAddress.setColonyName("Jai Jawan Colony");
		primaryAddress.setStreetName("Kapra");
		primaryAddress.setPinCode(3434343);
		primaryAddress.setLandMark("Near SBI Bank");
		return primaryAddress;
	}
	
	public void getMapDetails() {
		System.out.println("==========================================================================");
		//map object creating key and value both are Object datatype
		Map<Object, Object> data = new HashMap<>();
		data.put(1, "Hi");
		data.put("Id", 2021);
		data.put("myName", "Ramesh");
		data.put(getEmployeeData(), getAddressDetails());
		
		try {
			for(Map.Entry<Object, Object> map : data.entrySet()) {
				System.out.println(map);
			}
		}catch(Exception ex) {
			System.out.println("Exception occure :: "+ex);
		}
	}
}
