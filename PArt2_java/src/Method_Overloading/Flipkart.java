package Method_Overloading;

public class Flipkart {

	public void pay()
	{
		System.out.println("Paying through cash on delivery");
	}
	
	public void pay(String phonepay)
	{
		System.out.println("paying through "+ phonepay);
	}
	
	public void pay(long upi)
	{
		System.out.println("paying through "+upi);
	}
	
	public static void main(String[] args) {
		Flipkart f= new Flipkart();
	    f.pay();
	    f.pay("PhonePay itself");
	    f.pay(45456464);

	}

}
