package Method_Overloading;

public class Calculator {

	public int add(int a, int b)
	{
		return a+b;
	}
	 private double add(double a, int b)
	 {
		 return a+b;
	 }
	 static void add()
	 {
		 System.out.println("adding");
	 }
	
	public static void main(String[] args) {
		Calculator c= new Calculator();
		System.out.println(c.add(1, 2));
		System.out.println(c.add(2.4, 6));
		c.add();

	}

}
