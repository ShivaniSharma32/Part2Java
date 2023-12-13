package Downcasting;



public class CompanyDriver {

	public static void main(String[] args) {
		Company c;
		c= new Employee1();
//		Employee2 e2 = (Employee2)c;
//		System.out.println(e2);
		// getting ClassCastingException
		
		//To remove this use instanceof operator
		
		if(c instanceof Employee2) {
			Employee2 e2 = (Employee2)c;	
		}
		else
		{
			System.out.println("you are downcasting it to different refrence");
		}
	}

}
