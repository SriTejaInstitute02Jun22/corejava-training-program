package com.sriteja.exceptions;

public class ExceptionDemo {

	public  static void main(String args[]) {
		
		int i = 12;
		int j =  0;
		
		ExceptionDemo cust = new ExceptionDemo();
		
		
		int response;
		try {
			response = cust.get(i, j);
			System.out.println(response);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException===="+e);
		} catch (Exception e) {
			System.out.println("Exception===="+e);
		}
		
		
		
		//----------
		int res;
		try {
			res = cust.m1(i, j);
			System.out.println(res);
		}catch(Exception e) {
			System.out.println("Exception===="+e);
		}
		
	}
	
	//using throws keyword 
	public int get(int i, int j) throws NullPointerException, Exception{
		
		int k = i/j;
		
		return k;
	}
	
	//using throws keyword 
		public int m1(int i, int j) throws Exception, NullPointerException, ArrayIndexOutOfBoundsException {
			
			int k = i/j;
			
			return k;
		}
}
