package Bank;

public class AcountAr {
	
	
	private  String[] name;
	private double[] balance={0};	
	//private static int AcCount=0;
	
	public  AcountAr(String name,double balance,int i)
	{
		this.name[i]=name;
		this.balance[i]=balance;	
	}
	
	
	
	
	public String getName(int i)
	{
		return name[i];
	}
	
	public double getbalance(int i)
	{
		return balance[i];
	}
	
	/*public int getCount(int i)
	{
		return AcCount[i];
	}*/

}
