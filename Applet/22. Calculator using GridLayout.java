
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code = MyELClass21 width = 400 height = 400></applet>*/
public class MyELClass21 extends Applet implements ActionListener
{
	Button add,sub,mul,div,mod;
	Label n1,n2,r;
	TextField t1,t2,t3;
	public void init()
	{
		n1 = new Label("Enter Number 1");
		n2 = new Label("Enter Number 2");
		r = new Label("Result is");
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		t3.setEditable(false);
		add = new Button("Add");
		sub = new Button("Subtract");
		mul = new Button("Multiply");
		div = new Button("Divide");
		mod = new Button("Modulo");
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		add(n1);
		add(t1);
		add(n2);
		add(t2);
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(mod);
		add(r);
		add(t3);
	}
	public void actionPerformed(ActionEvent e)
	{
		int a, b ,c=0;
		a = Integer.parseInt(t1.getText());
		b = Integer.parseInt(t2.getText());
		if(e.getSource()==add)
		{
			c = a+b;
		}
		else if(e.getSource()==sub)
		{
			c = a-b;
		}
		else if(e.getSource()==mul)
		{
			c = a*b;
		}
		else if(e.getSource()==div)
		{
			c = a/b;
		}
		else if(e.getSource()==mod)
		{
			c = a%b;
		}
		t3.setText(Integer.toString(c));
	}
}
