package Shapes;

public class Cicrle implements Cloneable {

	protected double y=0,r=1,x=0;
	
	Cicrle()
	{
		x=0;
		y=0;
		r=1;
	}
	
	public double  pi=3.14159;
	
	public Cicrle(double y,double r,double x)
	{
		this.y=y;
		this.r=r;
		this.x=x;
	}
	
	
	
	double Circumfernce()
	{
		double circum;
		circum=2*pi*r;
		
		return circum;
	}
	
	public double Area()
	{
		double area=0;
		area=pi*r*r;
		
		return area;
	}
	
	protected double getx() {
		// TODO Auto-generated method stub
		return x;
	}
	
	private double gety() {
		// TODO Auto-generated method stub
		return y;
	}

	
	public static void statmathod()
	{
		System.out.println("I'm Circle static method");
	}
	
	//@overright

	public String ToString()
	{
		//return("i ma circle,x-center="+x+",center= y-center="+y+" radius"+r);
		//System.out.printf(" Shape Detail:%s%f%n", "x-center=",getx(),y);
		return String.format("%nShape Detail: x=%f ||y=%f %n",getx(),gety());
	}


	
	public Object clone() throws CloneNotSupportedException
	{
		Cicrle c=(Cicrle) super.clone();
		return c;
	}
	
	
	
	public boolean equals(Object o)
	{
		if(o==null ||!(o instanceof Cicrle))return false;
		
		else
		{
			Cicrle c=(Cicrle)o;
			return(r==c.r && x==c.x);
		}
		
	
		
	}








	
	
	
	
}
