package Cookie;











public class monster002Arrays {
	
	
	public static int  factorial (int n){
		int factorial=1;
		for(int i=1;i<=n;i++)
			factorial*=i;
	{
		return factorial;
	}}

	
	public static void main(String[ ] args)
	{
		int result=factorial(6);	
		System.out.println(String.format("The Factorial of %d is %d",6,result));
	

	
	int [][] strArr=new int [3][3];
	{
	for(int i=0;i<3;i++) 
	 {
		for(int j=0;j<3;j++) 
		{
			strArr[i][j] =i+j;
	
		}
	  }
	for(int i=0;i<3;i++) 
	 {
		for(int j=0;j<3;j++) 
		{
			System.out.print(strArr[i][j]);
		}
		System.out.println("  ");
	  }
	 }

	
	

}}
