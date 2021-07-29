package Employees;

public abstract class Employee {
	
	Contact contact;
	protected final String firstName;
	protected final String lastName;
	protected final String socialSecurityNumber;	
	
	public Employee(Contact contact,String firstName, String lastName, String socialSecurityNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.contact = contact;
	}
	
	public abstract double Earning();
	//public abstract void ShowInfo();
	
	public String ToString()
	{
		return String.format("Employee detail: %s%s%s%s%s%s%s%s%s%s"
				,"\n",firstName,"\n",lastName,"\n",socialSecurityNumber,"\n",contact.getEmail(),"\n",contact.getPhoneNumber());
	}
	


}
