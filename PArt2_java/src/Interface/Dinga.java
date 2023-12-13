package Interface;

import java.util.Scanner;

public class Dinga implements Demo1{
	
	public static void main(String[] args) {
		Dinga d= new Dinga();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of a and b");
		System.out.println("Addition is "+ d.add(sc.nextInt(), sc.nextInt()));
		System.out.println("enter the value of c and d");
		System.out.println("Substraction is "+ d.sub(sc.nextInt(), sc.nextInt()));
		
		
	}

}
