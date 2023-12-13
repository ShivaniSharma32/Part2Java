package Object_Class;

public class MainStudentClass {

	public static void main(String[] args) 
	{
		Student_EqualsM s1= new Student_EqualsM(10);
		Student_EqualsM s2= new Student_EqualsM(10);
		System.out.println(s1.equals(s2));// for this we need upcasting and downcasting
		System.out.println(s1.age==s2.age);
	//System.out.println(s1.age.equals(s2.age));

	}

}
