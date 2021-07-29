package Shapes;



public class Cylinder extends Cicrle{
	
	protected double y=0,r=1,x=0,h=1;
	
	double  pi=3.14159;
	
	public  Cylinder(double y,double r,double x,double h)
	{
		super(y,r,x);
		
		this.h=h;
	}
	
	public double Area()
	{
		double area1=0;
		area1=(2*super.Area())+(2*pi*r*h);
		
		return area1;
		
	}
	
	public double AreaCylinder()
	{
		double area;
		area=2*pi*r*r+2*pi*r*h;
		
		return area;
	}
	
	public double VolumeCylinder()
	{
		double volume;
		volume=pi*r*r*h;
		
		return volume;
	}
	

	
	
	
	public String toString()
	{
		//return("i ma circle,x-center="+x+",center= y-center="+y+" radius"+r);
		//System.out.printf(" Shape Detail:%s%f%n", "x-center=",getx(),y);
		return String.format("Cylinder detail:%s Height=%f",super.toString(),h);
	}


}
