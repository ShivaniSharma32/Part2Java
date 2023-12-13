package Non_Primitive_Type_Casting;

public class AnimalDriver {

	public static void main(String[] args) {
	//	Animal a= new Dog();// no need to add Animal a= (Animal) new Dog ..b'coz here we r storing the address of subclass in superclass container 
	//OR you can write expilicitly or implicitly 
	Animal a=(Animal) new Dog();// upcasting
	System.out.println(a);
	System.out.println(a.a);
	//System.out.println(a.b);cannot access 
		Dog d= new Cat();
		System.out.println(d);
        Animal a1= new Cat();
        System.out.println(a1);
//Dog d2= (Dog)new Animal();// cannot store the address of superclass in subclass container like this
        Dog d2= (Dog)a; //downcasting ... write tyecast operator excplicity only
         
        
        System.out.println(d2);
        
        System.out.println(d2.a);
        System.out.println(d2.b);
        
        
	}

}
