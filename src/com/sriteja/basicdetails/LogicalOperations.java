package com.sriteja.basicdetails;

public class LogicalOperations {

	public static void main(String args[]) {
		
		//Logical Operations &&, ||, !
		int i =12;
		int j=30;
		//Syntax: condition_1 && condition_2 => (true  && true) =>output: true
		System.out.println(i<j && i>j);	//((12<30) && (12>30)) -> (true && false) => false
		System.out.println(8<9 && 6>1);	//((8<9) && (6>1)) 	-> (true && true)	=> true
		
		/*Syntax: condition_1 || condition_2 
		 * (true  || false) =>output: true
		 * (false  || true) =>output: true
		 * (false || false) =>output: false
		 * (true || true) =>output: true
		 */
		System.out.println(i<j || i>j);	 //((12<30) || (12>30))	((true) || (false)) =>output : true
		System.out.println(5>10 || 12<2);
		System.out.println(12>10 || 12<20);
		
		System.out.println("=====Bitwise AND(&), OR(|) Operator=============");
		System.out.println(8<9 & 6>1);	//((true) & (true)) => true
		System.out.println(i<j | i>j);	//((12<30) | (12>30)) => ((true) | (false)) =>output : true
		
		//Logical NOT (!)
		System.out.println("======Logical NOT (!)==========");
		System.out.println(!true); //false
		System.out.println(!false); //true
		
		System.out.println(!(j>i)); //false => !(30>12) => !(true) =>output: false
		System.out.println(!(i>j)); //true	=>	!(12>30) => !(false) =>output: true 
				
		
	}
}
