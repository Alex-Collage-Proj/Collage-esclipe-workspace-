package Univer;

class employee extends Person
{
	
	String WorkType;
	int WorkHr;
	int Payment;
	
	
	public employee (String n,int I,String workt,int workhr,int pay)
	{
		super (n,I);
		WorkType=workt;
		WorkHr=workhr;
		Payment=pay;
	}
	
	public void printempl()
	{
		super.print();
		System.out.println("WorkType="+WorkType);
		System.out.println("WorkHr="+WorkHr);
		System.out.println("payment="+Payment);
	}
	
}