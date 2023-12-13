package Upcasting;

public class Person {

	String name;
	int age;
	String gender;
	
	Person(String name, int age, String gender)
	{
		this.name= name;
		this.age= age;
		this.gender= gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}
	
}
