package Abstraction;

public class Employee_Sub extends Employee{
	
	public void details()
	{
		System.out.println("He is from Delhi");
	}

	public static void main(String[] args) {
		
		Employee_Sub e = new Employee_Sub();
		e.details();
	}

}
