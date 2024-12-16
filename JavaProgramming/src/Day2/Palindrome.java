package Day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int checked_number = n;
         int temp =0,rem=0;
         while (n!=0) {
        	 rem = n%10;
        	 temp = temp*10 + rem;
        	 n=n/10;
         }
         System.out.println("Reverse of the given number is " +temp);
         if (temp == checked_number) {
        	 System.out.println("The entered number is an palindrome : " + checked_number);
         }
         else {System.out.println("The entered number is not an palindrome : " + checked_number);}
         
	}

}
