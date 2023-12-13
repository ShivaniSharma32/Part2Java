package Object_Class;

public class hashcodeMethod {

	public int hashcode()
	{
		return 100;
	}
	
	public static void main(String[] args) {
		hashcodeMethod h1 =new hashcodeMethod();
		System.out.println(h1.hashcode()); // once u write this and after override the hascode method, u need to write this again b'coz 
		//hashcode is holding the previous generated value
		hashcodeMethod h2= new hashcodeMethod();
		System.out.println(h2.hashcode());
		

	}

}
