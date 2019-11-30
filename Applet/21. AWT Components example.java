import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code = MyELClass20 width = 300 height = 300></applet>*/
public class MyELClass20 extends Applet
{
	Label l1;
	TextField t1;
	TextArea t2;
	Button b;
	public void init()
	{
		l1 = new Label("This is a label");
		t1 = new TextField("This is a TextField");
		t2 = new TextArea("This is a TextArea",10,4);
		b = new Button("Button");
		add(l1);
		add(t1);
		add(t2);
		add(b);
	}
}

