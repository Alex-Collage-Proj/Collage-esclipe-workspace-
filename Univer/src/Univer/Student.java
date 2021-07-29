package Univer;

class Student extends Person
{
	String department;
	int courses;
	int payment;
	
	
	public Student (String n,int I,String dep,int cou,int pay)
	{
		super (n,I);
		department=dep;
		courses=cou;
		payment=pay;
	}
	
	public void printstud()
	{
		super.print();
		System.out.println("department="+department);
		System.out.println("courses="+courses);
		System.out.println("payment="+payment);
	}
	
}



