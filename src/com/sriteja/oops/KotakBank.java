package com.sriteja.oops;

public class KotakBank extends RBLBank{

	public static void main(String args[]) {
		
		String drivingLicence = "10/13 JJ Colony, Hyd";
		KotakBank kb = new KotakBank();
		kb.kycNewDocumentUpdates(drivingLicence);
	}
}
