package Day5;

class A1{
	int a = 100;
	void show(int a) {
		System.out.println(a);
	}
}

class B1 extends A1{
	int b = 200;
	
	//overriding
	void show(int a) {
		System.out.println(a+a);
	}
	//overloading
	void show(int a,int c) {
		System.out.println(a+c);
	}
	
	void display() {
		System.out.println(b);
	}
}

class C1 extends B1{	
	void sum() {
		System.out.println("Sum of "+a+" + "+b+" is "+(a+b));
	}

	public void show() {
		// TODO Auto-generated method stub
		
	}
}

public class InheritanceClass {
	
 public static void main(String[] args) {
	C1 c_class = new C1();
	c_class.display();
	c_class.show();
	c_class.sum();
	System.out.println(c_class.a);
	System.out.println(c_class.b);
	
	B1 b_class = new B1();
	b_class.show(73);
	b_class.show(73,23);
}
}
