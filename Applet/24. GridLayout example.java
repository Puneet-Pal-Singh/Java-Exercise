
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code = MyELClass23 width = 300 height = 300></applet> */
class SampleFrame extends Frame 
{
 SampleFrame(String title) 
 {
 super(title);
 MyWindowAdapter adapter = new MyWindowAdapter(this);
 addWindowListener(adapter);
 }
  public void paint(Graphics g) {
g.drawString("This is in frame window", 10, 40);
}
}
class MyWindowAdapter extends WindowAdapter 
{
 SampleFrame sampleFrame;
 public MyWindowAdapter(SampleFrame sampleFrame) 
 {
  this.sampleFrame = sampleFrame;
 }
 public void windowClosing(WindowEvent we) 
 {
  sampleFrame.setVisible(false);
 }
}
public class MyELClass23 extends Applet implements MouseListener
{
 Frame f;
 Label l1,l2,l3,l4;
 public void init()
 {
	 setLayout(new GridLayout(2,2));
	 l1 = new Label("Label 1");
	 l2 = new Label("Label 2");
	 l3 = new Label("Label 3");
	 l4 = new Label("Label 4");
	 addMouseListener(this);
	 f = new SampleFrame("A Frame Window");
	 f.setSize(150, 150);
	 f.setVisible(true);
	 add(l1);
	 add(l2);
	 add(l3);
	 add(l4);
 }
 public void mousePressed(MouseEvent m)
 {
	 setBackground(Color.red);
 }
 public void mouseReleased(MouseEvent m)
 {
	 setBackground(Color.blue);
 }
  public void mouseExited(MouseEvent m)
 {}
  public void mouseEntered(MouseEvent m)
 {}
  public void mouseClicked(MouseEvent m)
 {}
  public void start() 
 {
  f.setVisible(true);
 }
 public void stop() 
 {
  f.setVisible(false);
 }
}
 
