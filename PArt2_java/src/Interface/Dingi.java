package Interface;

import java.util.Scanner;

public class Dingi implements Demo1 {

	public static void main(String[] args) {
		Dingi d= new Dingi();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of a and b");
		System.out.println("Addition is "+ d.add(sc.nextInt(), sc.nextInt()));
		System.out.println("enter the value of c and d");
		System.out.println("Substraction is "+ d.sub(sc.nextInt(), sc.nextInt()));

	}

}
// Dinga dingi demo1 is the ex of hierarchical inheritance in interface 