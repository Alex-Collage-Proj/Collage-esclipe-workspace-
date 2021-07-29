package Employees;

public class BasedPlusComissionEmployee extends CommissionEmployee {
	
	private double baseSalary; // base salary per week

	public BasedPlusComissionEmployee(Contact contact,double baseSalary,double grossSales,double commissionRate,String firstName, String lastName, String socialSecurityNumber)
	{
		super(contact,grossSales,commissionRate,firstName,lastName,socialSecurityNumber);
		this.baseSalary = baseSalary;
	}
	
	
	public double Earning()
	{
		return baseSalary + super.Earning();
	}
	
	public double Bonus()
	{
		return (super.Earning()* 0.1) ;
	}
	
	
//	public void ShowInfo()
	//{
	//	System.out.println("Emoloyee Name : " +firstName);
	//}
	
	public String ToString()
	{
		return String.format("BasedPlusCommissionEmployeeDetails %s%s%f",super.ToString(),"\n",baseSalary);
	}
}
