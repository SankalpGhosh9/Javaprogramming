package Day2;

import java.util.Scanner;

public class OddEvenNumberCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int counterE=0,counterO=0,rem=0;
        while(number!=0) {
        	rem=number%10;
        	if(rem%2==0) {
        		counterE++;
        	}
        	else {
        		counterO++;
        	}
        	number/=10;
        }
        System.out.println("The number contains "+counterO+" Odd numbers");
        System.out.println("The number contains "+counterE+" Even numbers");
	}

}