package paintProj;



import java.lang.System;
import java.util.Random;
import java.awt.Graphics;
import javax.swing.JFrame;

public class DrawTest {

	public static void main(String[] args) {
		Random rand=new Random();
	
		// TODO Auto-generated method stub	

	JFrame window=new JFrame();
	MyPanel drawing=new MyPanel();
	
	window.add(drawing);
	//setDefultCloseOpreration
	
	
	window.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
	
	window.setSize(200,200);
	window.setVisible(true);
	
	
	}

}
