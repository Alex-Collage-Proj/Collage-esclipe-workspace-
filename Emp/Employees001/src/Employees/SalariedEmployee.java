package Employees;


public class SalariedEmployee extends Employee implements Comparable, Cloneable{
	
	
	private double weeklySalary;
	
	public SalariedEmployee(Contact contact,double weeklySalary,String firstName, String lastName, String socialSecurityNumber)
	{		
		super(contact,firstName,lastName,socialSecurityNumber);	
		this.weeklySalary = weeklySalary;
	}
	
	//public void ShowInfo()
	//{
	//	System.out.println("Emoloyee Name : " +firstName);
	//}
	
	public double Earning()
	{
		return weeklySalary * 4;
	}
	
	public String ToString()
	{
		return String.format("SalariedEmployeeDetails = %s%s%f",super.ToString(),"\n",weeklySalary);
	}

	@Override
	public int CompareTo(Object Obj) {
		// TODO Auto-generated method stub
		if(!(Obj instanceof SalariedEmployee))
			return -2;
		else
		{
			SalariedEmployee SE = (SalariedEmployee)Obj;
			if((Earning()-SE.Earning()>0)) return 1;
			else if(Earning()-SE.Earning()<0) return -1;
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
			s.contact = (Contact) contact.close();
			return s;
				
		}
		
		
	
}
