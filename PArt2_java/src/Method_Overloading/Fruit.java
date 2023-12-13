package Method_Overloading;

public class Fruit {
	
	public void eat()
	{
		System.out.println("eating");
	}
	
	public void eat(String s)
	{
		System.out.println("fruit name=="+ s);
	}
	
	public void eat(String s, double b)
	{
		System.out.println(s+ " "+b);
	}
	public static void main(String[] args)
	{
		Fruit f=  new Fruit();
		f.eat();
		f.eat("Apple");
		f.eat("Apple", 230);
	}
	

}
