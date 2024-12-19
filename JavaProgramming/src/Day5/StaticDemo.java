package Day5;

public class StaticDemo {
	static int a =10;
	int b = 20;
	
	static void m1() {
		System.out.println("This is a static method");
	}
	 void m2() {
		 System.out.println("This is a non-static method");
	}
	
	public static void main(String[] args) {
			m1();
			StaticDemo sd = new StaticDemo();
			sd.m2();
	}

}
