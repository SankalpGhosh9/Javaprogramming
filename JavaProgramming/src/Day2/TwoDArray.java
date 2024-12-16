package Day2;

public class TwoDArray {

	public static void main(java.lang.String[] args) {
		//int a [][] = new int [3][3];
		
		//initializing an array (declaring an array)
		int a [][]= {	{100,200,300}, //adding value in 2d array  
						{400,600,900}, 
						{500,800,700}
						};
		System.out.println("Length of rows is " + a.length);
		System.out.println("Length of columns is " + a[0].length);
		System.out.println(a[2][1]);//single value
		
		//for loop implementation for all value
		for (int i =0;i<=a.length-1;i++) {
			for (int j =0;j<=a[i].length-1;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("......................");
		
		//for each implementation
		for (int arr[]:a) {
			for(int x :arr) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
		System.out.println("......................");
	}
	

}