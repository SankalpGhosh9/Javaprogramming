package Day3;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the word :");
      String s = sc.next();

      String temp="";
     for (int i =s.length()-1;i>=0;i--) {
    	 temp = temp+s.charAt(i);
     }
     System.out.println("Reverse of the word  : " +s+" is : "+temp);
     
     //Approach 2
     String s1 = sc.next();
     String temp1 ="";
     char a[]=s1.toCharArray();
     for(int i=a.length-1;i>=0;i--) {
    	 temp1=temp1+a[i];
     }
     System.out.println(temp1);
     
     
     //Approch 3
     String n = sc.next();
     StringBuilder s2 = new StringBuilder(n);
     System.out.println("Reverse using Stringbuilder Class : "+s2.reverse());
     
     
     String n1 = sc.next();
     StringBuffer s3 = new StringBuffer(n1);
     System.out.println("Reverse using StringBuffer Class : "+s3.reverse());
     
	}
	
}
      


