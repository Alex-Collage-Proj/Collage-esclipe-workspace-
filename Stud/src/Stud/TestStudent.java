package Stud;

public class TestStudent {
	
	 public static void f()
	 {
		 System.out.println("fooooo");
	 }
	
	 public static void main(String[ ] args)
	 {
		 Student s1=new Student("st1",90.95);
		 Student s2=new Student("st2",70);
		 Student s3=new Student("st3",50);
		 
		 
		 s1.display();
		 s2.display();
		 s3.display();
		 f();
		 Student.changCollege();
	 
		 s1.display();
		  s2.display();
		  s3.display();
	 }
	
	 

	 
	 
	
	
	
	
	
	

}
