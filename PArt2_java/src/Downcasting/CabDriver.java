package Downcasting;

import java.util.Scanner;

public class CabDriver {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome \n enter yout choice");
		System.out.println("1.mini\n 2.sedan\n 3.lux");
		int choice= sc.nextInt();
		Cab b;
		switch(choice) {
		case 1:
		   b= new MiniCab();
			System.out.println(b);
			b.location="saibihar";
			b.arriving_time=3;
			if(b instanceof MiniCab) {//  take positive scenario..
			MiniCab m= (MiniCab)b;
			System.out.println("price is ="+ m.price);
			System.out.println("location is ="+m.location);
			System.out.println("arriving time is="+m.arriving_time);}
			else {
				System.out.println("the instance is not present");
			}
			break;
		case 2:
			b= new LuxCab();
			b.location="vivoty";
			b.arriving_time=7;
			if(b instanceof LuxCab) {
				LuxCab l= (LuxCab)b;
				System.out.println("price is ="+ l.price);
				System.out.println("location is ="+l.location);
				System.out.println("arriving time is="+l.arriving_time);}
				else {
					System.out.println("the instance is not present");
				}
		break;
		case 3:
			b= new SedanCab();
			b.location="opty";
			b.arriving_time=8;
			if(b instanceof SedanCab) {
				SedanCab l= (SedanCab)b;
				System.out.println("price is ="+ l.price);
				System.out.println("location is ="+l.location);
				System.out.println("arriving time is="+l.arriving_time);}
				else {
					System.out.println("the instance is not present");
				}
		}
		

	}

}
