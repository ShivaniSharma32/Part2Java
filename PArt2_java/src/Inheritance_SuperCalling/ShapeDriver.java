package Inheritance_SuperCalling;

public class ShapeDriver {

	public static void main(String[] args) {
		
		Triangle t1= new Triangle("VolumeOFTriangle");
		System.out.println(t1.name);
		System.out.println(t1.height);
		System.out.println(t1.width);
		System.out.println(t1.volume());

	}

}
