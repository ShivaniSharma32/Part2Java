package Types_Of_Inheritance;

public class Hierarchi_Vehicle_Driver {

	public static void main(String[] args) {
		
		Hierarchi_Car c1= new Hierarchi_Car();
		System.out.println("======CAR========");
		System.out.println(c1.brand);
		System.out.println(c1.price);
		
		Hierarchi_Bike b1= new Hierarchi_Bike();
		System.out.println("======BIKE========");
		System.out.println(b1.brand);
		System.out.println(b1.price);
		
		Hierarchi_MotorCycle m1= new Hierarchi_MotorCycle();
		System.out.println("======MOTOR========");
		System.out.println(m1.brand);
		System.out.println(m1.price);
	}

}
