package Employees;

public class BasedPlusCommissionsEmployee extends CommissionEmployee  {

	

	private double baseSalery,BaseSale,Bouns;//base salary per week
	
	public BasedPlusCommissionsEmployee(String firstName, String lastName, String socialSecurityNumber,
			double grossSales, double CommissionRate,double baseSalery)
	{
		super(firstName, lastName, socialSecurityNumber, grossSales, CommissionRate);
		
		this.baseSalery=baseSalery;
		
	}
	
	public double returnbaseSale()
	{
		return BaseSale=baseSalery*CommissionEmployee.getweekly();
	}
	
	public String toString()
	{
		return super.toString()+BaseSale;
	} 

	public double getBouns()
	{
		return ((baseSalery*CommissionEmployee.getweekly())*0.1)+baseSalery*CommissionEmployee.getweekly();
	}
	
	public double getbounsB()
	{
		return ((baseSalery*CommissionEmployee.getweekly())*0.1)+(baseSalery*CommissionEmployee.getweekly())+CommissionEmployee.getweekly();
	}
	
}
