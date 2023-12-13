package Interface;

public interface Demo1 {
	
	public default int add(int a,int b)
	{
		return (a+b);
	}

	public default int sub(int c, int d)
	{
		return (c-d);
	}
	
	
}
