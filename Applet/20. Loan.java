//Question

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code = MyELClass19 width = 300 height = 300></applet>*/
public class MyELClass19 extends Applet implements ActionListener
{
	Label l1,l2;
	TextField t1,t2,t3,t4;
	Button amt;
	Checkbox chk;
	public void init()
	{
		l1 = new Label("Enter Principal amount, rate and Time(in years)");
		l2 = new Label("Amount to be re-paid is:");
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		t4 = new TextField();
		t4.setEditable(false);
		amt = new Button("Amount");
		amt.addActionListener(this);
		chk = new Checkbox("Is Rate Monthly?");
		add(l1);
		add(t1);
		add(t2);
		add(t3);
		add(chk);
		add(amt);
		add(l2);
		add(t4);
	}
	public void actionPerformed(ActionEvent e)
	{
		Float p,r,t,a;
		p = Float.parseFloat(t1.getText());
		r = Float.parseFloat(t2.getText());
		t = Float.parseFloat(t3.getText());
		if(chk.getState()==true)
		{
			a = p + (p*r*t*12)/100;
		}
		else
		{
			a = p + (p*r*t)/100;
		}
		t4.setText(Float.toString(a));
	}
}
