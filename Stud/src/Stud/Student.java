package Stud;

public class Student {
	String name;
	double avg;
	static private String college="minhal college";

	static void changCollege()
	{
		college="sami";

	}
	
	///////
	public Student(String name,double avg)
	{
		this.name=name ;
		this.avg=avg;
	}
	void display()
	{
		System.out.println(name+" "+avg+" "+college);
	}
	
	
	
	
	
}
