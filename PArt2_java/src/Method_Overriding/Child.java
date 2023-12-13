package Method_Overriding;

public class Child extends Parent {
	@Override
	public void bike()
	{
		System.out.println("modified data");
	}
//	@Override
//	 static void m1()// static method cannot be override, to check write @override, without annotation ,-you can write same method but it is taking as a new method internally
//	{
//		
//	}
public static void main(String args[])
{
	Child c= new Child();
	c.bike();
	c.m1();
			
}
}
