package com.sriteja.controlstatements;

public class TernaryOperatorsMultipleCondtions {

	// creating main method
	public static void main(String args[]) {

		// instance variables
		String date = "10-Feb-2022";

		String matchingDate = (date.contains("10"))
				? (date.contains("Jan"))
						? (date.contains("2022")) ? "Month: Januvary, Date:10, Year:2022" : "Month is not Januvary"
						: (date.contains("Feb"))
								? (date.contains("2022")) ? "Month: Februvary, Date:10, Year:2022"
										: "Month is not Februvary"
								: "No matching"
				: (date.contains("11"))
						? (date.contains("Jan")) ? (date.contains("2022")) ? "Month: Januvary, Date:11, Year:2022"
								: "Month is not Januvary" : "Month is not Januvary"
						: (date.contains("Feb")) ? (date.contains("2022")) ? "Month: Februvary, Date:11, Year:2022"
								: "Month is not Februvary" : "Month is not Februvary";

		System.out.println(matchingDate);

		System.out.println("==============================================================");
		int i = 10;
		int j = 60;
		String name = "Ramesh";
		String dept = "Salse";

		String k = (dept.contains("IT"))
						? ((j >= 60) && name.contains("Ramesh")) ? "Department is IT" : "Department is not IT"
				: (dept.contains("Admin")) ? "Department is Admin"
						: (dept.contains("Salse")) ? "Department is Sales" : "Department is not matching";

		System.out.print(k);
	}
}
