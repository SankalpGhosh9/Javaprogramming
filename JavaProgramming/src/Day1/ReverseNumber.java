package Day1;

public class ReverseNumber {
public static void main(String args[]) {
	int a  = 1234;
	int temp = 0;
	int rem=0;
	while (a!=0) {
		rem = a%10;
		temp = temp*10 + rem;
		a/=10;
	}
	System.out.println(temp);
}
}
