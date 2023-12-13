package Types_Of_Inheritance;

public class Multi_level_Child extends Multi_level_Parent{
	
	Multi_level_Child()
	{
		super("Shivani");
	}
	

	public static void main(String[] args) {
	 
		Multi_level_Child s= new Multi_level_Child();
		System.out.println(s.name +" "+s.surname);
				
				
	}

}
