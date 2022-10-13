package com.sriteja.exceptions;

public class GmailValidationException {

	public static void main(String args[]) {
		
		String myEamilId = "ramesh223@gmail.com";
		String myPassword = null;
		
		GmailValidationException gmailValidation = new GmailValidationException();
		try {
			
			String res = gmailValidation.getGamilAccountDetails(myEamilId, myPassword); //method calling
			
			System.out.println(res);
		}catch(Exception ex) {
			System.out.println("Wrong password. Try again or click ‘Forgot password’ to reset it.");
		}
		
	}
	
	public String getGamilAccountDetails(String myEamilId, String myPassword) {	//method creation
		
		String response = null;
		
		if(myEamilId.equals("ramesh223@gmail.com") && myPassword.equals("abc123")) {
			response = "Welcome to Your Gmail Account.......Ramesh";
		}
		
		return response;
	}
}
