package Has_A_Relationship_LazyInst;

public class Pen_Driver {

	public static void main(String[] args) {
		Pen p= new Pen("Cello",23,2);
		System.out.println(p);
		System.out.println(p.i);
		System.out.println("==================");
		p.CreateObject();
		System.out.println("Pen Details");
		System.out.println("Ink Colour is "+ p.i.getColour());
		System.out.println("Pen Brand is =" +p.getBrand());
		System.out.println("Pen Price is =" +p.getPrice());
		System.out.println("Pen Quantity ="+p.getQuantity());
		

	}

}
