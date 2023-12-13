package Object_Class;

public class ComapreNameEquals {
	String name;
	double Salary;
	
	ComapreNameEquals(String name,double Salary)
	{
		this.name= name;
		this.Salary=Salary;
	}

	public boolean equals(Object obj)
	{
		ComapreNameEquals e= (ComapreNameEquals)obj;
		return this.name.equals(e.name)&& this.Salary==e.Salary;
	//	return this.name==e.name&& this.Salary==e.Salary; // it is also working
	}
	
	public static void main(String[] args) {
		ComapreNameEquals e1= new ComapreNameEquals("shiva",35000);
		ComapreNameEquals e2= new ComapreNameEquals("shiva",35000);
		System.out.println(e1.equals(e2));// it is showing false ,...if we don't override equals 
	}
}
