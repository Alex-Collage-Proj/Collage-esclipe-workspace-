package Employees;

import java.util.ArrayList;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> EmpList = new ArrayList<>();
		
		Employee s1 = new SalariedEmployee(new Contact("054-8776558","pop1@gmail.com"),400,"Popi","Rosh","20524345");
		Employee H1 = new HourlyEmployee(new Contact("051-3336558","ron@gmail.com"),50,6,"Beni","Roben","2103334");
		Employee C1 = new CommissionEmployee(new Contact("030-7899958","mom2@gmail.com"),100,45,"Rave","Raven","240124100");
		Employee B1 = new BasedPlusComissionEmployee(new Contact("033-8776141","ronaldmo@gmail.com"),77,55,46,"Robi","Rab","1211111");
		
		System.out.println("Compare between Employees");
		SalariedEmployee Comp1 = new SalariedEmployee(new Contact("051-2234567","ah3@gmail.com"),500,"Roben","ash","20155998");
		SalariedEmployee Comp2 = new SalariedEmployee(new Contact("050-22534267","ayyyt@gmail.com"),1000,"Gaben","rosh","20005367");		
		System.out.println("Comp1 Compared to Comp2 =" + Comp1.CompareTo(Comp2));
		System.out.println();
		
		EmpList.add(s1);
		EmpList.add(H1);
		EmpList.add(C1);
		EmpList.add(B1);
		
		
		for(Employee element : EmpList)
		{
			System.out.println(element.ToString());
			
			System.out.println("Employee's Earning : "+ element.Earning());
			
			if(element instanceof BasedPlusComissionEmployee)
			{												    			
				System.out.println("Bonus :"+((BasedPlusComissionEmployee)element).Bonus());
				//BasedPlusComissionEmployee c = ((BasedPlusComissionEmployee) element);
			    System.out.println("After Bounus : " + (((BasedPlusComissionEmployee)element).Bonus() + element.Earning()));
			}
					 			 
			System.out.println("\n");
			
		}
		
		
		System.out.println("Work 5 :");
		
		
		try {
			SalariedEmployee SE1 = new SalariedEmployee(new Contact("070-2111567","mister@gmail.com"),749,"Rash","bash","207655944");
			System.out.println("SE1 original :" + SE1.ToString());
			SalariedEmployee SE2 = (SalariedEmployee)SE1.clone();
			
			System.out.println();
			
			System.out.println("SE2 as copy :" + SE2.ToString());
			System.out.println("Are they equal?");
			System.out.println(SE1.equals(SE2)+"\n");
						
		} 
		
		
		
		catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Work 6 :" + "\n");
		
		
		try {
			SalariedEmployee SEnormal = new SalariedEmployee(new Contact("070","mis@gmail.com"),749,"Rash","bash","207655944");
			SalariedEmployee SEcopy = (SalariedEmployee)SEnormal.clone();
			
			System.out.println("Before : \n\n" + SEnormal.ToString() +"\n"+"\n"+SEcopy.ToString());
			
			SEcopy.contact.setEmail("Chan@gmail.com");
			SEcopy.contact.setPhoneNumber("080");
			
			System.out.println("After : \n\n" + SEnormal.ToString() +"\n"+"\n"+SEcopy.ToString());
		}
		
		
		
		catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
