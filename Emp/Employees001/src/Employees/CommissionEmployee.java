package Employees;

public class CommissionEmployee extends Employee {
	
	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage

	
	public CommissionEmployee(Contact contact,double grossSales,double commissionRate,String firstName, String lastName, String socialSecurityNumber)
	{
		super(contact,firstName,lastName,socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		
	}
	
	public double Earning()
	{
		return grossSales * commissionRate;
	}
	
	//public void ShowInfo()
	//{
	//	System.out.println("Emoloyee Name : " +firstName);
	//}
	
	public String ToString()
	{
		return String.format("CommissionEmployeeDetails = %s%s%f%s%f",super.ToString(),"\n",grossSales,"\n",commissionRate);
	}
	
}
