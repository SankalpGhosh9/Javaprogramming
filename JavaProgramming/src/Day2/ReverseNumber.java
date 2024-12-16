package Day2;

public class ReverseNumber {

	public static void main(String[] args) {
	   int number = 1234;
	   int rem=0 ,temp=0;
	   while(number!=0) {
			   rem = number % 10;
			   temp = temp*10 + rem;
			   number = number /10;
		   }
		  System.out.println(temp);
	   
	}

}
