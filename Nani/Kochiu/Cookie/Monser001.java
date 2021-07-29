package Cookie;

import java.util.Scanner;

public class Monser001 {
	
	
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("array size :");
		int n = scan.nextInt();
		
		String[] Name = new String[n];
		String[] Phone = new String[n];
		
		System.out.println("give me a number and a number N times:");

	    for(int i=0; i<Name.length;i++)
		{
			int j=0;
			
			Name[i] = scan.next();
			Phone[i] = scan.next();
			System.out.print(Name[i] + " " + Phone[i]);
			System.out.print("\n");
			j++;
		}

}}
