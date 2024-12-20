package Day6;

import java.util.Scanner;

/*
  	Errors :-
	1)Syntax Error
	2)Logical Error
	
	Exception :-
	1)User mistake
*/
public class ExpectionHandlingClass {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			 System.out.print("Enter a number ");
	    int number = sc.nextInt();
	    
	    try {
	    	System.out.println(100/number);
	    	}	
	     catch(ArithmeticException e) {
	    	 System.out.println("Invalid data");
	     }
	     
	    System.out.println("Program is completed");
	    System.out.println("Program is exited");
		}
	}
