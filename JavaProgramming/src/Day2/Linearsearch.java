package Day2;

import java.util.Arrays;

public class Linearsearch {

	public static void main(java.lang.String[] args) {
		int a[]= {10,20,7,67,8,19,78};
		System.out.println(Arrays.toString(a));
		int search_element = 9;
		boolean flag_state = false;
		for (int x:a) {
			if (search_element == x) { 
				System.out.println("Element found : "+ x);
				flag_state = true;
				break;
			}
	}
		if (flag_state == false) {
		System.out.println("Element not found");}
}
}
