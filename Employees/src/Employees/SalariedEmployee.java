package Employees;

public class SalariedEmployee  extends Employee implements Comparable,Cloneable {
	
	


	private double weeklySalary,weekly;
	private Contact contact;
	
	
    
	
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,double weeklySalary) 
	{
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary=weeklySalary;
		
	}
	
	public double RetWeekly()
	{
		return weekly=weeklySalary*4;
		
	}
	
	public String toString()
	{
		return super.toString()+weeklySalary*4;
	}

	@Override
	public double ComapreTo(Object obj) {
		// TODO Auto-generated method stub
		if(!(obj instanceof SalariedEmployee))
			return -2;
		else
		{
			SalariedEmployee SE = (SalariedEmployee)obj;
			if((RetWeekly()-SE.RetWeekly()>0)) return 1;
			else if(RetWeekly()-SE.RetWeekly()<0) return -1;
			else
			{
				return 0;
			}
		}
	}
	
	
	public boolean equals(Object o)
	{
		if(o==null || !(o instanceof SalariedEmployee)) return false;
		else
		{
			SalariedEmployee s = (SalariedEmployee)o;
			return (firstName == s.firstName && socialSecurityNumber == s.socialSecurityNumber);
		}
	}
		
		
	public Object clone() throws CloneNotSupportedException
	{		
		SalariedEmployee s = (SalariedEmployee)super.clone();
		Contact contact = null;
		s.contact = (Contact) contact.close();
		return s;
			
	}

	public Contact getContact() {
		// TODO Auto-generated method stub
		return contact;
	}

	@Override
	public Object clone(Object obj) {
		// TODO Auto-generated method stub
		return obj;
	}

		
	
	
}
