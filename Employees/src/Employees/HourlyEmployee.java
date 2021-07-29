package Employees;

public class HourlyEmployee extends Employee{

	private static double  daily;

	private double wage;//per hr payment
	
	private double hours;
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,double wage,double hours)
	{
		
		super( firstName, lastName, socialSecurityNumber);
		this.wage=wage;
		this.hours=hours;
//		daily=wage*hours;
		
	}
	
	public  double RetDaily()
	{
		return daily=wage*hours;
	}
	
	public String toString()
	{
		return super.toString()+wage*hours;
	} 
	
	
	
	
	
}
