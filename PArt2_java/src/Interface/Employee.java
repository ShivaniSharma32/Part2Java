package Interface;

public class Employee implements Manager{

	

	@Override
	public void details() {
		System.out.println("Companyname is test Yantra");
		
	}

	@Override
	public void detailsAboutManager() {
		
	System.out.println("manager name is priya");	
	}

	public static void main(String[] args) {
	Employee e= new Employee();
	e.detailsAboutManager();
	e.details();

	}
}
