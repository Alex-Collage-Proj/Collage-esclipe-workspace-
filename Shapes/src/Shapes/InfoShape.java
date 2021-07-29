package Shapes;




public class InfoShape implements Cloneable{
	
	public static void main(String[] args) 
	{
		double x,y,z;
		
		Cicrle c1=new Cicrle(3,2,3);
		Cicrle c=new Cicrle(1,1,5);
		Cicrle c3=new Cicrle(6,5,5);
		
		
		
		System.out.print(c1.Circumfernce()+"  " +c1.Area()+"\n");  
		
		Cylinder C1=new Cylinder(3,3,2,2);
		
		System.out.print(C1.AreaCylinder()+" "+C1.VolumeCylinder());
		
		
		System.out.print(c1.ToString());
		System.out.print(C1.ToString());
		System.out.print("++++++++++++++++++++++++++++++++++++");
		System.out.print("\n"+"Test Equals and Clone:");
		
		
		try {
			
			
			System.out.println(c.equals(c3));
			
			Cicrle c4=(Cicrle)c3.clone();
			
			System.out.println("\n"+"Test Equals and Clone:"+c3.equals(c4)+c3.ToString());
			System.out.println("Test Equals and Clone:"+c1.equals(c4)+c1.ToString());
			System.out.println("Test Equals and Clone:"+c3.equals(c4));	
		}
		
		
		
		
		
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	

}
