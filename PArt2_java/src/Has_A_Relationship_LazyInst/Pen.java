package Has_A_Relationship_LazyInst;

public class Pen {

	private String brand;
	private double price;
	private int quantity;
	
	Ink i;
	
	void CreateObject()
	{
		i= new Ink("black");
		
	}
	
	Pen(String brand, double price,int quantity )
	{
		this.brand = brand;
		this.price = price;
		this.quantity= quantity;
	}

	
	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public Ink getI() {
		return i;
	}

//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
//
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}

	
	
}
