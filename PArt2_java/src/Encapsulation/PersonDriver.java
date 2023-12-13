package Encapsulation;

public class PersonDriver {

	public static void main(String[] args) {
		PersonData pd= new PersonData("Shiva@20", "abc");
		System.out.println(pd.getEmail());
		System.out.println(pd.getPassword());
		pd.setEmail("Prachi@12");
		pd.setPassword("123");
		System.out.println(pd.getEmail());
		System.out.println(pd.getPassword());

	}

}
