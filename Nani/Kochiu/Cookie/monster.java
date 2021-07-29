package Cookie;

import java.util.Scanner;

public class monster {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i,b=0;
		
	Scanner Number =new Scanner(System.in);
	System.out.println("how many number?");
	int size=Number.nextInt();
	
	   Scanner scannername = new Scanner(System.in);  // Create a Scanner object
	  
	
	
	int[] number=new int[size];
	String[] userName=new String[size];
	int flag=0;
	for(i=0;i<size;i++)
	{
		if(flag==0)
		{
		 System.out.println("Enter username"); 
		    userName[i] = scannername.nextLine();
		    flag=1;
		}
		
		       
		    if(flag==1)
		    {
		    	System.out.println(String.format("Enter Phone   number "));
		    	number[i]=Number.nextInt();
		    	flag=0;
		    }  
		
	}
	
	for(i=0;i<size;i++)
	{
		System.out.println("Name:"+userName[i]);
		System.out.println("Phone Num:"+number[i]);
	}
	}}
