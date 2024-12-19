package Day3;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements needed : ");
		int n = sc.nextInt();
		int a[] = new int [n];
		int largest_number = 0;
		int smallest_number=0;
		
		//number entered
		for (int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		//Sum of entered element along with largest and smallest number
		int sum1=0;
		for(int i=0;i<a.length;i++) {
				sum1=sum1+a[i];
				smallest_number=a[i];
				if(largest_number<=a[i]) {
					largest_number=a[i];
				}
				 if(smallest_number>=a[i]) {
					 smallest_number=a[i];
					 }
			}
		System.out.println("Largest number is : "+largest_number);
		System.out.println("Smallest number is : "+smallest_number);
		System.out.println("Sum of element in the array : "+ sum1);
		
		//Sum of the range from smallest to largest number in the array
			int sum2=0;
		       for (int i=smallest_number;i<=largest_number;i++) {
		    	   sum2 = sum2 + i;
		       }
		       System.out.println("sum of the range of number is : "+sum2);
		       if(sum2-sum1==0) {
		    	   System.out.println("No number is missing");
		       }
		       else {
		    	  int missing_number=sum2-sum1;
		    	  System.out.println("Missing element in the sequence is : "+missing_number);
		       }
		       }
		}
	  
