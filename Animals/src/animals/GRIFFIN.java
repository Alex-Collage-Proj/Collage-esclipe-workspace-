package animals;

public class GRIFFIN extends Animal implements Leg,Tail,Wing{
	
	public GRIFFIN(String type,int age)
	{
		super(age);
		
	}
	

	public GRIFFIN(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String WingDetails() {
		// TODO Auto-generated method stub
		return ("2 Wings");
	}

	@Override
	public String tailDetails() {
		// TODO Auto-generated method stub
		return ("Got Tail");
	}

	@Override
	public String legDetails() {
		// TODO Auto-generated method stub
		return ("4 Griffin legs");
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("Aaa");
		
	}
	

}
