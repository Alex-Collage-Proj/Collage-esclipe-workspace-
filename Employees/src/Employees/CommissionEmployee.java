package Employees;

public class CommissionEmployee extends Employee{

	private static double weeklySales;
	
	private double grossSales;
	
	private double CommissionRate;
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,double grossSales,double CommissionRate) 
	{
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales=grossSales;
		this.CommissionRate=CommissionRate;
		this.weeklySales=grossSales*CommissionRate;
	}
	

	public  double RetweeklySales()
	{
		return weeklySales=grossSales*CommissionRate;
	}
	
	public static  double getweekly()
	{
		return weeklySales;
	}
	
	public String toString()
	{
		return super.toString() +"rate:"+grossSales*CommissionRate+",";
	} 
	
	
	
}
