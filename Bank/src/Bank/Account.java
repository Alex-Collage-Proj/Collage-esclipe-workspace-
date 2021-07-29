package Bank;
import java.util.ArrayList;

public class Account {
	
	
	private String name;
	private String Last;
	private String Phone;
	private double balance=0;	
	private int Tz=0;
	private static int AcCount=0;
	
	
/*	public  ListAC(String name,String Last,int Phone,int Tz,double balance)
	{
		this.name=name;
		this.Last=Last;
		this.Phone=Phone;
		this.Tz=Tz;
		this.setBalance(balance);
		this.AcCount+=1;
		
	}*/
		
	public  Account(String name,String Last,String Phone,int Tz,double balance)
		{
			this.name=name;
			this.Last=Last;
			this.setPhone(Phone);
			this.setTz(Tz);
			this.setBalance(balance);
			this.AcCount+=1;

		}
	   
		
		public String getName()
		{
			return name;
		}
		
		public double getbalance()
		{
			return getBalance();
		}
		
		public int getCount()
		{
			return AcCount;
		}
		
		
		public double withrawal(double depositAmoun)
		{
			
		 this.setBalance(this.getBalance() - depositAmoun);
		 return getBalance();
		}
		
		public double  deposit(double depositAmoun)
		{
			
		 this.setBalance(this.getBalance() + depositAmoun);
		 return getBalance();
		}
		
		
		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		public void setName(String name)
		{
			this.name=name;
		}
		
		public String getname()
		{
			return name;
		}
	
		public int getCounter() 
		{
			return AcCount;
		}

		public void Transport(Account a1,Account a2,int deposit)
		{
			
			a1.setBalance(a1.balance - deposit);
			
			a2.setBalance(this.getBalance() + deposit);
			
		}

		public String getLast() {
			return Last;
		}

		public void setLast(String last) {
			Last = last;
		}

		public String getPhone() {
			return Phone;
		}

		public void setPhone(String phone) {
			Phone = phone;
		}

		public int getTz() {
			return Tz;
		}

		public void setTz(int tz) {
			Tz = tz;
		}
		
		
		
		
		
		
}
