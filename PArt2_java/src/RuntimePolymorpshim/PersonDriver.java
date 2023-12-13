package RuntimePolymorpshim;



public class PersonDriver {

	public static void main(String[] args) {
		Person1 p= new Person1();
		p.use();
		Employee e1 = new Employee();
		e1.use();
		Person1 p2= new Employee(); // upcasting
		
		p2.use();// getting subclass o/p instead of superclass---- dynamic binding

	}

}
