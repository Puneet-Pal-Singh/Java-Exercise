
import java.awt.*;    
import java.applet.*; 
/* <applet code = MyELClass25 width = 300 height = 300></applet> */       
public class MyELClass25 extends Applet    
 {    
   Font f1;    
    
   public void  init()    
    {    
       f1 = new Font("Arial",Font.BOLD,20);    
	}
	public void  paint(Graphics g)    
    {    
      g.setFont(f1);
	  g.setColor(Color.GREEN);
	  g.drawString("Hello",50,50);    
	}
 }	
