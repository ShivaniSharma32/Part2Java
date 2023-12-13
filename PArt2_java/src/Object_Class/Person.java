package Object_Class;

public class Person {
	
	int age;
	String name;
	
	public Person(int age, String name) {
		this.age=age;
		this.name=name;
	}

	public String tostring()// overriding tostring()
	{
		return "age="+age + "name="+name;
	}

	public static void main(String[] args) {
		Person p = new Person(10, "tom");
		System.out.println(p);

	}

}
