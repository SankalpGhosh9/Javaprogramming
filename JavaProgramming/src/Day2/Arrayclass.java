package Day2;

public class Arrayclass {

	public static void main(java.lang.String[] args) {
		
         int a[]= {100,22,3334,333344};
         System.out.println(a.length); //length of an array
         
         for (int i=0;i<=a.length-1;i++) {
        	 System.out.println(a[i]);
         }
         // for each loop
         for(int x:a) {
        	 System.out.println(x);
         }
	}

}