package oops.abstraction;

public class SBI implements RBI	

{

	//@Override - this is annonatation
		public void savingsAcc() {
			
			System.out.println("SBI Savings Account");
		}

		//@Override
		public void currentAcc() {
			
			System.out.println("SBI current Account");
		}

		//@Override
		public void creditCard() {
			
			System.out.println("SBI Credit Card");
			
		}

		//@Override
		public void debitCard() {
			
			System.out.println("SBI Debit Card");
			
		}

}
