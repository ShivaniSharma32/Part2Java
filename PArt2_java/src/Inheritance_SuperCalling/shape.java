package Inheritance_SuperCalling;

public class shape {

    
	
	int height;
	int width;
	
	
	shape(  int height, int width)
	{
		
		
		this.height= height;
		this.width= width;
	}
	
	public double volume()
	{
		return 0.5*height*width;
	}
}

