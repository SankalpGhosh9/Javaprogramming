package Day2;

import java.util.Arrays;

public class EvenOddCount {
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5,6,7};
		int counterE = 0;
		int counterO = 0;
		System.out.println(Arrays.toString(a));
		for (int i =0;i<a.length;i++) {
			if (a[i]%2==0) {
				counterE++;
			}
			else {
				counterO++;
			}
		}
		System.out.println("Even = "+ counterE);
		System.out.println("Odd = " + counterO);
		
	}
 
}
