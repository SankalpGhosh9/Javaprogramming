package Day1;

public class Largest2 {
public static void main (String args[]) {
	int a=10,b=8;
	if (a>b) {
		System.out.println(a +" = a is largest");
	}
	else {
		System.out.println(b +" = b is largest");
	}
	int c =  a>b?a:b;
	System.out.println(c + " is largest");
 }
}