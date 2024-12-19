package Day2;

import java.util.Arrays;

public class Char_sort {

	public static void main(String[] args) {
		String s[] = {"San","Sankalp","Viper","Sova","Skye","Omen"};
		char c[]= {'A','B','C','T','Z','Y','O'};
		System.out.println("Before sorting string :" + Arrays.toString(s));
		System.out.println();
		System.out.println("Before sorting string :" + Arrays.toString(c));
		System.out.println(".............................................");
		
		Arrays.sort(s);
		Arrays.sort(c);
		
		System.out.println("After sorting string :" + Arrays.toString(s));
		System.out.println();
		System.out.println("After sorting string :" + Arrays.toString(c));
	}

}
