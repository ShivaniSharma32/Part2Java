package Inheritance_SuperCalling;

public class Ball {
double pi;
double radius ;


Ball(double pi, double radius){
	this.pi=pi;
	this.radius=radius;
}

public double circum()
{
	return 2*pi*radius;
}


}
