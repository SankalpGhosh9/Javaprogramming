package Day4;

import java.util.Scanner;

public class InheritanceClass {
 
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();

	//Inheritance implemation using Method Overloading

	/*
      1)Methods must have same name.
      
      2)Methods must have different parameters.
      
      3)Methods may have different datatypes of parameter.
      
      4)If above all condition is having same then , 
      try changing the parameters orders sequence.
      
      5)If return types are different but ,
      with same params and name it will be considerd as duplicate only.
      
	 */
	void sum() {
		System.out.println(a+b);
	}
	
	void sum(int x,int y) {
		System.out.println(x+y);
	}
	 
	void sum(double x,int y) {
		System.out.println(x+y);
	}
	
	void sum(int x,double y) {
		System.out.println(x+y);
	}
	
	double sum1(int x,double y) {
		return (x+y);
	}
	void sum(int x,int y,int z) {
		System.out.println(x+y+z);
	}
}
