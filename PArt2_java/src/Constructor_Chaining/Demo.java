package Constructor_Chaining;

public class Demo {

	
	Demo()
	{
		this(10);
		System.out.println("Hello");
	}
	Demo(int a)
	{
		this(1,2);
		System.out.println(a);
	}
	Demo(int a, int b)
	{
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Demo d1= new Demo();

	}

}
