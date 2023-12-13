package Object_Class;

public class Emp{

	int salary;
	
	Emp(int salary)
	{
		this.salary= salary;
	}
	
	public boolean equals(Object obj)
	{
		Emp s3= (Emp)obj;
		return this.salary==s3.salary;
	}
	
	public static void main(String[]args)
	{
		Emp e1= new Emp(2000);
		Emp e2 = new Emp(4000);
		System.out.println(e1.equals(e2));
	}
}
