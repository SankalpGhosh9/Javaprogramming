package Day6;

import java.util.Scanner;

public class MultipleCatchBlock {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 //System.out.print("Enter the string ");
	 String s = null;

	 try {
		 System.out.println("String is in proper format"+s.length());
	}	
	 catch(ArithmeticException e) {
	 System.out.println("Invalid data");
	 System.out.println(e.getMessage());
	 }
	 catch(NullPointerException e) {
		 System.out.println("Invalid data");
		 System.out.println(e.getMessage());
		 }
	 catch(NumberFormatException e) {
		 System.out.println("Invalid data");
		 System.out.println(e.getMessage());
		 }
	 finally {
		 System.out.println("ok");
	 }
	 
 }
}
