package com.sriteja.enums;

public class EnumDemo {

	public static void main(String args[]) {
		
		EnumDemo emDemo = new EnumDemo();
		emDemo.checkEnumMethodDetails();
		
		new EnumDemo().getWeekDetails();
	}
	public void getWeekDetails() {
		System.out.println("1st day in the week :: "+Week.MONDAY);
		System.out.println("2nd day in the week :: "+Week.TUESDAY);
		System.out.println("3rd day in the week :: "+Week.WEDNESDAY);
		System.out.println("4th day in the week :: "+Week.THURSDAY);
		System.out.println("5th day in the week :: "+Week.FRIDAY);
		System.out.println("6th day in the week :: "+Week.SATURDAY);
		System.out.println("7th day in the week :: "+Week.SUNDAY);
		
	}
	
	public void checkEnumMethodDetails() {
		//enum methods
		System.out.println("ValueOf Method :: "+Week.valueOf("TUESDAY"));
		System.out.println("Value Method :: ");
		Week week[] = Week.values();
		System.out.println(week.toString());
	}
}


