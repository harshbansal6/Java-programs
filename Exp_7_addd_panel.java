// Exp No 7
// WAP to add panel into Frame.
import java.awt.*;
class myFrame_P extends Frame 
{
	Panel p;
	Button b;
	myFrame_P()
	{
		super("Experiment No. 7.");
		p = new Panel();
		b = new Button("I am into Panel");
		add(p);
		p.add(b);
		p.setLayout(new FlowLayout());
		p.setBackground(Color.blue);
		setLayout(new FlowLayout());
		setSize(500,500);
		setLocation(300,100);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new myFrame_P();
	}
}

