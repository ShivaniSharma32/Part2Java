package Access_Modifier;

public class Private_Access_Modifier {
	
	private String email;
    static int b;
    int c;//non-static variable
	public static void main(String[] args) {
	 int a;// local variable
		Private_Access_Modifier pm= new Private_Access_Modifier();
		System.out.println(pm.email);
		System.out.println(pm.b);
	//	System.out.println(pm.a);
		System.out.println(pm.c);
		
		
	}

}
