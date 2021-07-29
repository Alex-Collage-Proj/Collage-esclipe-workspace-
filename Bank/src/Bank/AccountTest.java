package Bank;
import java.util.ArrayList;
//import jdk.internal.loader.Loader;

public class AccountTest {
	
	public static Account[] stArr=new Account [5];
	
	public static ArrayList<Account> StList=new ArrayList<Account>();
	
	

	public static void main(String args[])
	{
		Diageram a=new Diageram("d");
		
		System.out.println(a.GetDiageram());
	
		
		
		// AccountCount=0;
		Account ac1=new Account("Nani","Nani","0568998756",32457224,1000);
		 ac1.setBalance(ac1.withrawal(400));
		Loan Lo1=new Loan("nani",1000,"2.4.2015","4");
		System.out.println("     ");
		
		System.out.println("/////////////////     ////////////////////////////");
		System.out.println("     ");
		System.out.println("Loaned Amout:"+Lo1.getAcCount()+"\nLoaned Name:"+Lo1.getName()+"\nLoan  :"+Lo1.getAmoutL()+"\nwhen He Took:"+Lo1.getStartDate()+"\nTook For years:"+Lo1.getEndDate());
		System.out.println("     ");
		System.out.println("/////////////////     ////////////////////////////");
		System.out.println("     ");
		Account ac2=new Account("Nano","Na","05785427756",32457987,10000);
		 	ac2.setBalance(ac2.deposit(750));
		
		Account ac3=new Account("fufo","ni","052757756",324657546,50000);
		 ac3.setName("funny");
		
		Account ac4=new Account("fufi","an","055744756",342567344,2000);
		
		Account ac5=new Account("dogo","Ni","056787756",324567532,10000);
		
		
		System.out.println("You Got :"+" "+ac5.getCount()+" Accounts");
		
		
		System.out.println("the name is:"+ac1.getName()+"   Balance:"+ac1.getbalance());
		System.out.println("the name is:"+ac2.getName()+"   Balance:"+ac2.getbalance());
		System.out.println("the name is:"+ac3.getName()+"   Balance:"+ac3.getbalance());
		System.out.println("the name is:"+ac4.getName()+"   Balance:"+ac4.getbalance());
		System.out.println("the name is:"+ac5.getName()+"   Balance:"+ac5.getbalance());
		
		
		
		
		System.out.println("     ");
		System.out.println("/////////////////     ////////////////////////////");
		System.out.println("     ");
		
		
		
		 ac2.Transport(ac1 , ac2, 50);
		 
		
		System.out.println("the name is:"+ac1.getName()+"   Balance"+ac1.getbalance());
		System.out.println("the name is:"+ac2.getName()+"   Balance"+ac2.getbalance());
		
		
		
		System.out.println("     ");
		System.out.println("/////////////////     ////////////////////////////");
		System.out.println("     ");
		
	
		
	 
	   stArr[0]=ac1;
	   stArr[1]=ac2;
	   stArr[2]=ac3;
	   stArr[3]=ac4;
	   stArr[4]=ac5;
		
	   
	   
	   StList.add(ac1);
	   StList.add(ac2);
	   StList.add(ac3);
	   StList.add(ac4);
	   StList.add(ac5);
	   for(Account ac : StList)
	   {
		   System.out.println("\nAccount: \n"+"\nname:"+ac.getName()+"\nLast-Name:"+ac.getLast()+
				   "\nPhone:"+ac.getPhone()+
				   "\nTz:"+ac.getTz()+
				   "\nBalance:"+ac.getbalance()+"\n \n////////////////////////////////////////");
		  
		   
	   }
		
	  
  
	   
	   
	   
		/*Account[] ac=new Account[5];
		
		 ac[0]=new Account("ni",200);
		
		 ac[1]=new Account("no",4000);
		
		 ac[2]=new Account("fo",3000);
		
		 ac[3]=new Account("fu",2000);
		
		 ac[4]=new Account("dogi",5000);
		 
		 
		 for(int i=0;i<ac.length;i++)
		 {
			 System.out.println("the name is:"+ac[i].getName()+"   Balance"+ac[i].getbalance());
		 } 
		*/
		
	}
	
	
	
	
	
	
	

}
