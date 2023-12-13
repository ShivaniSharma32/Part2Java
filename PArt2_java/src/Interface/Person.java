package Interface;

public class Person implements Demo{

	@Override
	public void simple() {
		System.out.println("hello");
		
	}
	public static void main(String[] args) {
		Person p= new Person();
		p.simple();
		p.disp();
		System.out.println(Demo.a);// static memeber not going to inherit..that's why p.a; is not working
		System.out.println(Demo.a1);
		Demo.test();
		
	}

}
