package Inheritance;

public class Static_member_access_subclass extends Static_member_Inherit_Superclass{

	public static void main(String[] args) {
		System.out.println(a);
		disp();
		Static_member_access_subclass t= new Static_member_access_subclass();
		System.out.println(t.b);
		t.test();
		Static_member_Inherit_Superclass t2= new Static_member_Inherit_Superclass();
		
		
	}

}
