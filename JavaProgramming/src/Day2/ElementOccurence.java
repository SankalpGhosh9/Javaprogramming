package Day2;

import java.util.Arrays;

public class ElementOccurence {

	public static void main(java.lang.String[] args) {
		int a[]= {1,2,33,4,55,4,55,6,6,7};
		int counter = 0;
		int occured_element = 55;
       for (int i =0;i<=a.length-1;i++) {
    	   if(a[i]==occured_element) {
    		   counter++;
    		   System.out.println(occured_element +" is found at position " + i);
    	   }
       }
       System.out.println("Ocuurence of "+occured_element+" is : "+counter);
       
      Arrays.sort(a);
      System.out.println(a);
	}

}
