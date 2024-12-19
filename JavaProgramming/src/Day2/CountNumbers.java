package Day2;

import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner (System.in);
       int number = sc.nextInt();
       int counter = 0;
       while (number!=0) {
    	   number/=10;
    	   counter++;
       }
       System.out.println(counter);
       
	}

}
