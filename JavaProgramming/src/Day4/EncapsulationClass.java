package Day4;

public class EncapsulationClass {
	private int accno;
	private String name;
	private double balance;
	
	public void setAccNo(int accno) {
		this.accno=accno;
	}
	
	public int getAccNo() {
		return accno;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setBalance(double balance){ // here the balance variable in params is local variable
		this.balance = balance;//here the balance variable using "this" keyword is class variable
	}
	public double getBalance() {
		return balance;
	}

	

	
	
}
