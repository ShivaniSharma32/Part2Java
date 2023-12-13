package Constructor_Chaining;

public class Assignment1_Employee {
	
	Assignment1_Employee()
	{
		this(1);
		System.out.println("Hello 0");
	}
	
	Assignment1_Employee(int a)
	{
		this(1,2);
		System.out.println(a +" "+"Is there");
	}
	Assignment1_Employee(int a, int b)
	{
		this(1,2,3);
		System.out.println(a +" " +b+" " +"is there");
	}
	Assignment1_Employee(int a, int b,int c)
	{
		System.out.println(a +" "+ b+" " +c +" "+ "is there");
	}

	public static void main(String[] args) {

		Assignment1_Employee e1= new Assignment1_Employee();

	}

}
