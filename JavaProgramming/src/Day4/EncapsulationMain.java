package Day4;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		EncapsulationClass ec = new EncapsulationClass();
		
		//Setters Calling
		ec.setAccNo(32632236);
		ec.setBalance(633689);
		ec.setName("Sankalp");
		
		
		//Getters Calling
		System.out.println("Name of the accountholder is : "+ec.getName());
		System.out.println("Account number of the accountholder is : "+ec.getAccNo());
		System.out.println("Balance of the accountholder is : "+ec.getBalance());
	}

}
