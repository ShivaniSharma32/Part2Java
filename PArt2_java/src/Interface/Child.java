package Interface;

public class Child implements Father, Mother {

	

	@Override
	public void motherProperty(String color) {
		
		System.out.println("Mother is "+color);
	}

	@Override
	public void fatherProperty(String color) {
		System.out.println("father is "+color);
		
	}
	
public static void main(String[] args) {
		
Child c= new Child();
c.fatherProperty("Black");
c.motherProperty("White");
	}

}
// ex of multiple inheritance 