package rectangle;

public class rectest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r1=new Rectangle(3,3,5,6);
		Rectangle r2=new Rectangle(70,30,2,4);
		
		System.out.println(r1.getH()+ " " + r2.getW()+" ; "+ "     "+r1.getOrigin().getpoint());
		
		r1.Printrec();
		r2.Printrec();
		
		

}
}
