package oops.abstraction;

public class Citi implements RBI {

	//@Override - this is annonatation
		public void savingsAcc() {
			
			System.out.println("Citi Savings Account");
		}

		//@Override
		public void currentAcc() {
			
			System.out.println("Citi current Account");
		}

		//@Override
		public void creditCard() {
			
			System.out.println("Citi Credit Card");
			
		}

		//@Override
		public void debitCard() {
			
			System.out.println("Citi Debit Card");
			
		}
}
