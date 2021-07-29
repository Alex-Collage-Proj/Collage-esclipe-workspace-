package animals;

public class Cow extends Animal implements Leg{
	
	public Cow(int age)
	{
		super(age);
	}
	
	public void talk()
	{
	 System.out.println("Moo!");
	}
	
	
	@Override
	public String legDetails() {
		// TODO Auto-generated method stub
		return ("4 Cow legs");
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
