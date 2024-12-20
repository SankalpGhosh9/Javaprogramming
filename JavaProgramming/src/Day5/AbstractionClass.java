package Day5;

interface Shape{
	int length=10; //final & static method
	int width=20;
	
	void circle();//abstract method
	//implementation usually not allowed in interface
	
	//for implementation in interface we need static or default methods
	
	default void rect() {
		System.out.println("This is an rectangle");
	}
	
	static int square(int l) {
		return (l*l);
	}
}


public class AbstractionClass implements Shape {
	public void circle(){
		System.out.println("This is an circle");
	}
	
 public static void main(String[] args) {
	 
	 //Scenario 1
	 AbstractionClass intf = new AbstractionClass();
	 intf.circle();
	 intf.rect();
	 System.out.println(Shape.square(32)); //Static method can be directly access from interface.
	 
	 //Scenario 2
	 Shape sh = new AbstractionClass();
	 sh.circle();
	 sh.rect();
	 System.out.println(Shape.square(3));
	 System.out.println(Shape.length+Shape.width);
}
}
