package Day2;

public class SumElementArray {

	public static void main(java.lang.String[] args) {
		int a[] = {1,2,3,4,5};
		int res = 0;
		for (int x:a) {
			res = res + x;
		}
		System.out.println(res+ " is of first approach");
		
		int result =0;
		for (int i=0;i<a.length;i++) {
			result = result + a[i];
		}
		System.out.println(result + " is of second approach");

	}

}
