package Abstraction;

public abstract class Atm {

	private double balance= 1000;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	abstract void withdraw(double amount);
	
	abstract void deposit(double amount);
	
	abstract String viewBalance();
	
	
	
	
	
	
	
}
