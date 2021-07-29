package animals;

public class Dog extends Animal implements Leg{
	
	public String type;
	
	public Dog(String type,int age)
	{
		super(age);
		this.type=type;
	}
	
	
	public void talk()
	{
	 System.out.println("Woof!");
	}


	public void GetType() {
		// TODO Auto-generated method stub
		System.out.println(type);
	}
	
	@Override
	public String legDetails() {
		// TODO Auto-generated method stub
		return ("4 Dog legs");
	}

	
/*
private int Age[]= {0};
private String Name[]={"NONAME"};

public void SetName(String Name,int i,int Age)
{ 
	this.Age[i]=Age;
	this.Name[i]=Name;
}

public  void GetName(int i)
{
	System.out.println(Name[i]+",Age:"+Age[i]);
	
}



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
	
	public int GetAge(int i)
	{	
		System.out.println(","+Age[i]);
		return Age[i];
	}
	*/
	

}
