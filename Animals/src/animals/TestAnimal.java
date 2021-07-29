package animals;

import java.util.ArrayList;



public class TestAnimal {

	public static void main(String [] args)
	{
	Cow cow= new Cow(5);
	Cat cat=new Cat(10);
	GRIFFIN Griffin=new GRIFFIN(100);
	
	Animal a=new Dog("waf",2);
	Dog NewD=(Dog)a;
	NewD.GetType();
	
	cat.talk();
	cow.talk();
	a.talk();
	
	ArrayList<Animal>animalsArr=new ArrayList<>();
	animalsArr.add(cat);
	animalsArr.add(cow);
	animalsArr.add(a);
	animalsArr.add(Griffin);
	
	System.out.println("------");
	
	for (Animal element :animalsArr) {
		
		element.talk();
		
	
		
		if(element instanceof Dog) 
			{
			Dog Dog_element=(Dog) element;
			Dog_element.GetType();
			System.out.println(Dog_element.legDetails());
			System.out.println("------");
			}
			
		if(element instanceof Cow) 
		{
			Cow Cow_element=(Cow) element;	
		System.out.println(Cow_element.legDetails());
		System.out.println("------");
		}
		
		
		
		if(element instanceof Cat)
			{
			Cat c_element=(Cat)element;
			System.out.println(c_element.legDetails());
			System.out.println("------");
			}
		
		
		if(element instanceof GRIFFIN)
		{
		GRIFFIN c_element=(GRIFFIN)element;
		System.out.println(c_element.legDetails()+"\n"+c_element.tailDetails()+"\n"+c_element.WingDetails());
		System.out.println("------");
		}
		
		
		System.out.println("------");
			
		}
		
	
	/*
	cat.talk();
	cat.SetAge(10, 0);
	cat.SetName("waffle", 0);
	cat.GetAge(0);
	cat.GetName(0);
	System.out.println("+++++++++");
	dog.talk();
	dog.SetAge(5, 0);
	dog.SetName("Ruffle", 0);
	dog.GetAge(0);
	dog.GetName(0);
	System.out.println("+++++++++");
	cow.talk();
	cat.SetName("Ruffle", 0, 10);
	cat.GetName(0);
	System.out.println("+++++++++");
	cow.SetName("Waffle", 0, 3);
	cow.GetName(0);
	System.out.println("+++++++++");
	dog.SetName("Snoopi", 0, 1);
	dog.GetName(0);
	animal.talk();
	System.out.println("+++++++++");
	 /////
	Dog newND=(Dog)animal;
	newND.GetName(0);
	++
	
/*	Cat newNC=(Cat)animal;
	newNC.GetName(0);
	
	Cow newNCO=(Cow)animal;
	newNCO.GetName(0);
*/	
	//////
/*	
	ArrayList<Animal>animalsArr=new ArrayList<>();
	animalsArr.add(dog);
	animalsArr.add(cat);
	animalsArr.add(cow);
	animalsArr.add(animal);
	
	
	
	for (Animal element :animalsArr) {
		
		element.talk();
		System.out.println("------");
		
		if(element instanceof Dog) {
			Dog Dog_element=(Dog) element;
			Dog_element.NewD();
		
			
		}
		
		
	
//		System.out.println("+++++++++");
		/*	if(element instanceof Cat)
		{
		cat.GetAge(0);
		cat.GetName(0);
		}
		
		if(element instanceof Cow)
		{
		cow.GetAge(0);
		cow.GetName(0);
		} */
	}
	
	}
	

