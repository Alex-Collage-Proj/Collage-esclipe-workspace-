package Employees;

public class HourlyEmployee extends Employee {
	
	private double wage; // wage per hour
	private double hour; // hours worked for week
	
	public HourlyEmployee(double wage,double hour,String firstName, String lastName, String socialSecurityNumber)
	{
		super(firstName,lastName,socialSecurityNumber);
		this.wage = wage;
		this.hour = hour;
	}

	public double Earning()
	{
		return wage * hour;
	}
	
	//public void ShowInfo()
	//{
//		System.out.println("Emoloyee Name : " +firstName);
//	}
	
	public String ToString()
	{
		return String.format("HourlyEmployeeDetails = %s%s%f%s%f",super.ToString(),"\n",wage,"\n",hour);
	}
	
}
