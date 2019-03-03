package oops.abstraction;

public class User {

	public static void main(String[] args) 
	{
		
		RBI ref;
		

		
		ref.creditCard();
		ref.debitCard();
		ref.currentAcc();
		ref.savingsAcc();
		
		
		ref = new Citi();
		ref.creditCard();
		ref.debitCard();
		ref.currentAcc();
		ref.savingsAcc();
		
		
		
		
		ref = new SBI();
		ref.creditCard();
		ref.debitCard();
		ref.currentAcc();
		ref.savingsAcc(); 
		

	}
	
	

}
