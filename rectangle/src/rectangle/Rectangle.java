package rectangle;

public class Rectangle {

	private int w=0;
	private int h=0;
	private Point origin;
	

	
		
		
		public Rectangle(int w, int h,int x,int y)
		{
		super();
		origin=new Point(x,y);
		this.w = w;
		this.h = h;
		}


		public int getW() {
			return w;
		}


		public void setW(int w) {
			this.w = w;
		}


		public int getH() {
			return h;
		}


		public void setH(int h) {
			this.h = h;
		}


		public Point getOrigin() {
			return origin;
		}


		public void setOrigin(Point origin) {
			this.origin = origin;
		}


		public Rectangle()
		{
			super();
			w=0;
			h=0;
		}
		

		public void Printrec()
		{
			System.out.println(w + "   "+ h+ "       "+origin.getpoint() );
			
		}

		
		
		
	

}
