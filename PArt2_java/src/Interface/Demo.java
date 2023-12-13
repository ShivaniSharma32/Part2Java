package Interface;

public interface Demo {
	
static int a=10;//by default it will public final static 
int a1=20;// by default it will public final static 

//Demo()
//{
//	Interface cannot have constructor
//}

static void test()
{
	System.out.println("static....");
}

default void disp()// only when default
{
	System.out.println("hii");
}

void simple();// it is taking by default..public abstract void simple();

public static void main(String[] args) {
	System.out.println(a);
	System.out.println(a1);//b'coz a1 by default static, that's why we can access  
	//Demo d1= new Demo();// we cannot able to instantiate/object of interface
	test();
	
	
	
}





}
