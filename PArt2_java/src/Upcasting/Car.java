package Upcasting;

public class Car extends Vehical{

	 Car() {
		super("TVS");
		
		
		
	}

	public static void main(String[] args) {
		Vehical v= new Car();
		System.out.println(v);
		System.out.println(v.name);

	}

}
