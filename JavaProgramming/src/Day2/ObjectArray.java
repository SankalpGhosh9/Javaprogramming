package Day2;

public class ObjectArray {

	public static void main(java.lang.String[] args) {
		Object a[] = {100,109.97,"Hello",'S',true};
		for (Object x:a) {
			System.out.println(x);
		}
		System.out.println(".................");
		System.out.println();
		for(int i =0;i<a.length-1;i++) {
			System.out.println(a[i]);
		}
		

	}

}
