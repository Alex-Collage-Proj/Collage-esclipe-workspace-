package Employees;
import java.util.ArrayList;

public class EarningTest  {
	
	public static Employee[] stArr=new Employee [5];
	
	public static ArrayList<Employee> StList=new ArrayList<Employee>();
	
	

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		
		 
		Employee Ac1=new Employee( "Dan","De","124");
		HourlyEmployee ac1=new HourlyEmployee("Dan","De","124",80,8);
		/////////////////////////////////////////////////////////////////////
		Employee Ac2=new Employee("Dor","Ee","123");
		CommissionEmployee ac2=new CommissionEmployee( "Dor","Ee","123",10,15);
		/////////////////////////////////////////////////////////////////////
		Employee Ac3=new Employee( "Dir","Ei","120");
		SalariedEmployee ac3=new SalariedEmployee( "Dir","Ei","120",250);
		/////////////////////////////////////////////////////////////////////
		Employee Ac4=new Employee( "Dar","Ae","1");
		SalariedEmployee ac4=new SalariedEmployee( "Dar","Ae","1",300);
		/////////////////////////////////////////////////////////////////////
		Employee Ac5=new Employee( "Bred","Ed","12");
		HourlyEmployee ac5=new HourlyEmployee("Bred","Ed","12",72,9);
		/////////////////////////////////////////////////////////////////////
		Employee Ac6=new Employee( "Var","Ve","16");
		BasedPlusCommissionsEmployee ac6=new BasedPlusCommissionsEmployee("Var","Ve","16",0.2,50,8);
		
		BasedPlusCommissionsEmployee ac7=(BasedPlusCommissionsEmployee)ac6;
		
		
		System.out.println("Daily:"+ac1.RetDaily()+"\n"+"Name:"+ac1.firstName);
		System.out.println("------------------------------------------------");
		System.out.println("Combinat:"+ac2.RetweeklySales()+"\n"+"Name:"+ac2.firstName);
		System.out.println("------------------------------------------------");
		System.out.println("Weekly:"+ac3.RetWeekly()+"\n"+"Name:"+ac3.firstName);
		System.out.println("------------------------------------------------");
		System.out.println("Weekly:"+ac4.RetWeekly()+"\n"+"Name:"+ac4.firstName);
		System.out.println("------------------------------------------------");
		System.out.println("Daily:"+ac5.RetDaily()+"\n"+"Name:"+ac5.firstName);
		System.out.println("------------------------------------------------");
		System.out.println("Mixed:"+ac6.returnbaseSale()+"\n"+"Name:"+ac6.firstName);
		System.out.println("------------------------------------------------");
		
		
		System.out.println("CheckTOString:"+ac1.toString());
		System.out.println("CheckTOString2:"+ac2.toString());
		System.out.println("CheckTOString3:"+ac3.toString());
		System.out.println("CheckTOString4:"+ac4.toString());
		System.out.println("CheckTOString5:"+ac5.toString());
		System.out.println("CheckTOString6:"+ac6.toString());//bugged 0.0.0
		System.out.println("------------------------------------------------");
		System.out.println("CheckBonus:"+ac6.getBouns());
		System.out.println("------------------------------------------------");
		
		
		ArrayList<Employee>EmployeeArr=new ArrayList<>();
		EmployeeArr.add(ac1);
		EmployeeArr.add(ac2);
		EmployeeArr.add(ac3);
		EmployeeArr.add(ac4);
		EmployeeArr.add(ac5);
		EmployeeArr.add(ac6);
		
		
		
		System.out.println("------");
		int Count=0;
		for (Employee Emp :EmployeeArr) 
		{
		
			Emp.toString();
			
			if(Emp instanceof BasedPlusCommissionsEmployee)//ask again how works the if
			{
				BasedPlusCommissionsEmployee EmpB_Emp=(BasedPlusCommissionsEmployee) Emp ;
				System.out.println(Emp.toString());
				System.out.println("without Bouns:"+ac6.returnbaseSale());
				System.out.println("With Bonus:"+((BasedPlusCommissionsEmployee) Emp).getBouns());
				System.out.println("------+++++++++++++++++++++++++++++++++---------");
			}
			
			if(Emp instanceof SalariedEmployee)
			{
				Count++;
			}
					
		 }
		
		
	
		
	//SalariedEmployee ac3=new SalariedEmployee("Dir","Ei","120",250);
	//	SalariedEmployee ac4=new SalariedEmployee("Dar","Ae","1",300);
		
		System.out.println("ac3 Compared to ac4 =" + ac3.ComapreTo(ac4));
		System.out.println("------+++++++++++++++++++++++++++++++++---------");
	/*
		SalariedEmployee ac10 = new SalariedEmployee(new Contact("070","mis@gmail.com"),"207655944","Rash","bash",749);
		System.out.println("AC10 original :" + ac10.toString());
		SalariedEmployee AC10 = (SalariedEmployee)ac10.clone(ac10);
		
		System.out.println();
		
		System.out.println("SE2 as copy :" + ac10.toString());
		System.out.println("Are they equal?");
		System.out.println(ac10.equals(ac10)+"\n");
		
		
		System.out.println( "======+++++++++++++========");
		
		
		SalariedEmployee ac101= new SalariedEmployee(new Contact("056","mis@g.com"),"207655944","Rash","bash",749);
		SalariedEmployee AC101 = (SalariedEmployee)ac101.clone(ac10);
		
		System.out.println("Before : \n\n" + ac101.toString() +"\n"+"\n"+AC101.toString());
		
		ac101.getContact().setEmail("g@gmail.com");
		ac101.getContact().setPhoneNumber("080");
		
		System.out.println("After : \n\n" + ac101.toString() +"\n"+"\n"+AC101.toString());
	}
	*/
}
}

