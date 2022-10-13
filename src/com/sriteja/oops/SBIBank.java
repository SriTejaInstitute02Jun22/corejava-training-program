package com.sriteja.oops;

public class SBIBank extends RBLBank {

	public static void main(String args[]) {

		String drivingLicence = "10/13 JJ Colony, Hyd";
		SBIBank sbi = new SBIBank();
		sbi.kycNewDocumentUpdates(drivingLicence);
	}


	//overriding 
		//SBIBank not following the RBL Rules so SBI following there own rules.
		public void kycNewDocumentUpdates(String drivingLicence) {
			System.out.println("I am not following any RBL Rules.....");
		}
}
