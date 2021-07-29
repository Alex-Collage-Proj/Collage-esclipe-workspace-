package Employees;

public class Contact implements Cloneable{
	private Contact contact;
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
	
	public  Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	@Override
	public Object clone(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
