package RuntimePolymorpshim;

public class Person1 {
	
public void use()
{
	System.out.println("Using keypad");
}
}
	class Employee extends Person1
	{
		public void use()
		{
			System.out.println("Using Apple");
		}
	}

