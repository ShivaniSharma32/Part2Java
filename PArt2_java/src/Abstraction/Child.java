package Abstraction;

public class Child extends Parent{
	public void property()
	{
		System.out.println("GrandParent Property is inherited");
	}
	
	public void parentProperty()
	{
		System.out.println(" Parent Property is inherited");
	}

	public static void main(String[] args) {
		
	//	Child c= new Child();
		Parent c= new Child();// upcasting ...by using this user cann't see the implementation only declaration...
		//  implementation option is showing but whe we do the project, developer hide the implementation option. 
		c.property();
		c.parentProperty();
		
	}

}
