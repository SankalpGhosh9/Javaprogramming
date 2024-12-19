package Day4;

public class EmployeeMain {

	public static void main(String[] args) {
				
		System.out.println();
		
		//Assigning values to the constructor;
		Employee emp2 = new Employee(71231213,"San","QA",40000);
		emp2.display();
		
		
		//using object refernce variables
		emp2.ename="San";
		emp2.eid=67567123;
		emp2.job="Devops";
		emp2.salary=656283;
		emp2.display();
		
		//using methods
		emp2.setEmployee(59215716,"Obito","Data-Analyst",30000);
		emp2.display();
		
		System.out.println("..................");
		
		InheritanceClass ic = new InheritanceClass();
		ic.sum();
		ic.sum(20, 90);
		ic.sum(80, 10);
		ic.sum(78, 99);
		ic.sum(9, 880, 54545);
		ic.sum1(232,133);
		
		System.out.println("..................");
		
		Box box1 = new Box(22,33,55);
		Box box2 = new Box(22.33);
		
		System.out.println("Volume is  : "+box1.volume());
		System.out.println("Volume is  : "+box2.volume());
	}

}
