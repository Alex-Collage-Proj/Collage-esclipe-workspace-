package paintProj;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.lang.System;


import javax.swing.JPanel;


public class MyPanel extends JPanel{

	
	
	
	

	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int red,green,blue;
		Random rand=new Random();
		
		red=rand.nextInt(256);
		green=rand.nextInt(256);
		blue=rand.nextInt(256);
		/*	g.drawLine(0,0,0,100);
		g.drawLine(0,0,100,0);
		g.drawLine(100,0,100,100);
		g.drawLine(0,100,100,100);
		g.drawLine(100,0,0,100);
		g.drawLine(0,0,100,100);
		g.drawLine(0,100,100,100);
		g.drawLine(100,50,50,50);
		g.drawLine(0,50,50,50);
		g.drawLine(50,50,0,25);
		g.drawLine(50,50,100,75);
		g.drawLine(50,100,50,0);*/
		
	
		 

		int width=getWidth();
		int height=getHeight();
		
	
		
		
		
		
		
		
		int x=0;
		int z1=1;
		int z=0;
		int y=0;
		//g.drawRect(0,0,width,height);
		
		//g.drawOval(0,0,width,height);
		
		int f=1;
		while(x<width)
		{
			red=rand.nextInt(256);
			green=rand.nextInt(256);
			blue=rand.nextInt(256);
			
			
			
			
			while(f!=0)
			
			{
			g.setColor(new Color(green,red,blue));
			g.fillRect(10+x, 10, 20, 20);
			g.fillRect(10+x,height-50,20,20);
			f=0;
			}
			
			if(f==0)
			{
				f=1;
			}
			
			
			
			g.drawLine(x,0,width-x,height);
			x+=50;
			g.drawLine(0,y,width,height-y);
			y+=50;
			
			g.setColor(Color.black);
			g.drawOval((width/2)-z,(height/2)-z,z+z,z+z);
			
			z+=50;
			}
		
		
	
		
		/*while(y<width)
		{
			g.drawLine(0,y,width,height-y);
			y+=25;
		}*/
		
		
	//	g.drawRect(50,20,200,500);
	//	g.drawOval(50,20,200,500);

		
	 }
		
	

	
		
	}
	
	
		
		
	
	


