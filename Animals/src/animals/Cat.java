package animals;

public class Cat extends Animal implements Leg,Cloneable{
	
	public Cat(int age)
	{
		super(age);
	}
	
	public void talk()
	{
	 System.out.println("Meow!");
	}

	@Override
	public String legDetails() {
		// TODO Auto-generated method stub
		return ("4 Cat legs");
	}


	
	
/*	
private int Age[]= {0};

private String Name[]={"NONAME"};


public Cat(String Name,int i,int age)
{ 
	super(age);
	this.Name[i]=Name;
}

public  void GetName(int i)
{
	System.out.println(Name[i]);
	
}

/*
	
	public void SetName(String Name,int i)
	{
		this.Name[i]=Name;
	}
	
	public  void GetName(int i)
	{
		System.out.println(Name[i]);
		
	}
	

	public void SetAge(int Age,int i)
	{
	 this.Age[i]=Age;
	 
	}
	
	public int[] GetAge(int i)
	{	
		System.out.println(","+Age[i]);
		return Age;
		
	}
	
	*/
	
}
