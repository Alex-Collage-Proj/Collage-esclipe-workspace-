package Ee;

public class PrintEe {
	
	public static <E> void printArr(E[]inputArr)
	{
		for(E e:inputArr)
		{
			System.out.print(e);
		}
		System.out.println();
	}
	
	
	public static <E> E Arr(E[]inputArr)
	{
		int count=0,a;
		for(E e:inputArr)
		{
			count++;
		}
		
		return (E)inputArr[count-1];
	}
	
	public static <E> E Mid1(E[]inputArr)
	{
		int count=0,a;
		for(E e:inputArr)
		{
			count++;
		}
		
		return (E)inputArr[count/2];
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Integer[] intArr= {1,2,3};
		String[] stArr= {"a","b","c"};
		printArr(intArr);
		printArr(stArr);
		System.out.println(Arr(stArr));
		System.out.println(Arr(intArr));
		System.out.println(Mid1(stArr));
		System.out.println(Mid1(intArr));
	}


	

}
