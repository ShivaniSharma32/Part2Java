package Object_Class;

public class hashAndEquals {

	
	
		int age;
		
		hashAndEquals(int age){
			this.age=age;
		
		}
		public int hashcode()
		{
			
			return 101;
	}

 public boolean equals(Object Obj) {
	 hashAndEquals h1=  (hashAndEquals)Obj;
	return this.age==h1.age;
	 
 }
 
 public static void main(String[] args) {
	 hashAndEquals h2= new hashAndEquals(10);
	 hashAndEquals h3= new hashAndEquals(10);
	 System.out.println(h2.hashcode());
	 System.out.println(h3.hashcode());
	 System.out.println(h2.equals(h3));// without using equal overriden, it is showing false , b'coz it is comapring original hashcode value.m
}
	}


