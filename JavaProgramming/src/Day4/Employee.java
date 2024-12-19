package Day4;

public class Employee {
	 //Variables
	int eid;
	String ename;
	String job;
	int salary;
  
	//Methods
	void display(){
		System.out.println(eid+" " + ename+" " + job+" " + salary);

	}
	void setEmployee(int id,String name,String work,int income) {
		eid=id;
		 ename=name;
		 job=work;
	    salary=income;
	}
	
	//Constructor creation and it will be called or invoke during the tiime of object creation.
	Employee(int id,String name,String work,int income){
		 eid=id;
		 ename=name;
		 job=work;
	    salary=income;
	}

}
