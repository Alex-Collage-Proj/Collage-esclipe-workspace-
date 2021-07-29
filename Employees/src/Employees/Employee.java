package Employees;
import java.util.Arrays;
import java.util.List;

public class Employee  {
	
	protected final String firstName;
	
	private final String lastName;
	
	protected final String socialSecurityNumber;
	
	
	
	public  Employee(String firstName,String lastName,String socialSecurityNumber)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.socialSecurityNumber=socialSecurityNumber;
		
	}



	public String toString()
	{
		return firstName+"," +lastName +","+socialSecurityNumber+",";
	} 




	
	
	

}
