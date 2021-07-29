package Employees;

public class Contact implements Cloneable{
	
	private String PhoneNumber;
	private String Email;
	
	public Contact(String PhoneNumber, String Email)
	{
		this.PhoneNumber = PhoneNumber;
		this.Email = Email;
	}
	
	public String getPhoneNumber()
	{
		return PhoneNumber;
	}
	
	public void setPhoneNumber(String PhoneNumber)
	{
		this.PhoneNumber = PhoneNumber;
	}
	
	public String getEmail()
	{
		return Email;
	}
	
	public void setEmail(String Email)
	{
		this.Email = Email;
	}
	
	protected Object close() throws CloneNotSupportedException 
	{
		Contact con = (Contact) super.clone();
		return con;
	}
	

}
