package Upcasting;

public class Student extends Person {
	
	void study()
	{
		System.out.println("studying");
	}

	public Student() {
		super("Shiva",56,"male");
		
		
	}

	public static void main(String[] args) {
		Person p= new Student();// upcasting
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.gender);
	//	p.study(); ....cannot access

	}

}
