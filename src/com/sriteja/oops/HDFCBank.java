package com.sriteja.oops;

public class HDFCBank extends RBLBank{

public static void main(String args[]) {
		
		String drivingLicence = "123/223,Hyd 500062";
		HDFCBank kb = new HDFCBank();
		kb.kycNewDocumentUpdates(drivingLicence);
	}
}
