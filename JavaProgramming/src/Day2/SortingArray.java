package Day2;

import java.util.Arrays;

public class SortingArray {

	public static void main(java.lang.String[] args) {
		int a[] = {1,2,3,4,55,66,3343,344,55,3,5,9};
		System.out.println("Before sorting array ....");
		System.out.println(Arrays.toString(a));
		
		System.out.println("After sorting array ....");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		

	}

}