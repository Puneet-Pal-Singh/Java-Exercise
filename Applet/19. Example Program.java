
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code = MyELClass18 width = 300 height = 300></applet> */
public class MyELClass18 extends Applet implements ActionListener
{
 Label label;
 TextField textField1,textField2;
 Button Answer; 
 public void init()
 {
	Label label = new Label("Who is the Prime Minister of India? ");
	textField1 = new TextField("");
	textField2 = new TextField("");
	textField2.setEditable(false);
	Answer = new Button("Answer");
	Answer.addActionListener(this);
	add(label);
	add(textField1);
	add(Answer);
	add(textField2);
 }
 public void actionPerformed(ActionEvent e) 
 {
	String s = textField1.getText();
	int i=0;
	if(i<3)
	{
		if(s.equals("Narendra Modi") || s.equals("Modi"))
		{
			textField2.setText("Correct");
			repaint();
			stop();
		}
		else
		{
			textField2.setText("Try Again.");
			i++;
			repaint();
		}
	}
	else
	{
		textField2.setText("Correct answer is Narendra Modi");
		stop();
	}
 }
}
