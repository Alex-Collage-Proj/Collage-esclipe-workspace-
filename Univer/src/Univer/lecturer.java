package Univer;

class lecturer extends Person
{
	
	String lecturername;
	int lecturerhr;
	int lecturerclass;
	
	
	public lecturer (String n,int I,String Lecturername,int Lecturerhr,int Lecturerclass)
	{
		super (n,I);
		lecturername=Lecturername;
		lecturerhr=Lecturerhr;
		lecturerclass=Lecturerclass;
	}
	
	public void printlect()
	{
		super.print();
		System.out.println("lecturername="+lecturername);
		System.out.println("lecturerhr="+lecturerhr);
		System.out.println("lecturerclass="+lecturerclass);
	}
}
	
