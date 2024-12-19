package Day3;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the word : ");
		String s = sc.next();
		String temp="";
		char a[] = s.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			temp=temp+a[i];
		}
		System.out.println(temp);
		if(s.equals(temp)) {
			System.out.println("The word is an palindrome ");
		}
		else {
			System.out.println("The word is not an palindrome ");
		}

	}

}
