package Abstraction;

public class AtmDriver {

	public static void main(String[] args) {
		Atm a= new Person1();
		
		a.withdraw(200);
		System.out.println(a.viewBalance());
		a.deposit(300);
		System.out.println(a.viewBalance());
		

	}

}
