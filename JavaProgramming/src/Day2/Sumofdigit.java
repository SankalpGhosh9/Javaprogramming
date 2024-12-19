package Day2;

import java.util.Scanner;

public class Sumofdigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int rem=0,temp=0;
		while(number!=0) {
			rem=number%10;
			temp = temp + rem;
			number/=10;
		}
		System.out.println(temp);

	}

}
