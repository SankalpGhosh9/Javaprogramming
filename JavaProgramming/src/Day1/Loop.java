package Day1;

public class Loop {

	public static void main(String[] args) {
	/*
	 
	 while(condition)
	 {
	 statement;
	 inc/dec;
	 }
	 */
        int i=1,j=1;
        while(i<11) {
        	System.out.println(i);
        	i++;
        }
//        while(j<=10){
//        	System.out.println("Hello");
//        	j++;
//        }
        while(j<=10) {
        	if (j%2==0) {
        		System.out.println(j);
        		} j++;
        }
        for (int i1=2;i1<=10;i1+=2) {
        	System.out.println(i1);
        }
        for (int i2 = 1;i2<=10;i2++) {
        	if(i2%2==0) {
        		System.out.println(i2 + " is Even");
        	}
        	else {
        		System.out.println(i2 + " is Odd");
        	}
        }
	}

}
