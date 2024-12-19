package Day3;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
//		String s = sc.next();
		String s = "whcbwuh bfdyv dw  hb";
		String temp = s.replaceAll("\\s", "");
		System.out.println(temp);
	}

}
