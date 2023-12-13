package Abstraction;

public class Person1 extends Atm{
     double updatedAmount;
     
	@Override
	void withdraw(double amount) {
		if(amount<=getBalance())
		{
			System.out.println("Withdrawl successfully");
			updatedAmount= getBalance()-amount;
			
		}
		else
		{
			System.out.println("Insufficent balance");
		}
		
	}

	@Override
	void deposit(double amount) {
		
		updatedAmount= amount+updatedAmount;
		
	}

	@Override
	String viewBalance() {
	
		return "balance is="+ updatedAmount;
	}
	 

}
