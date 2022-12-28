// Exp No 6
// WAP to add label and button on Frame.
import java.awt.*;
import java.awt.event.*;
class myFrame extends Frame implements ActionListener
{
	Label l; Button b;
	myFrame()
	{
		super("My first frame .");
		l = new Label("This is Experiment no 6.");
		b = new Button("Click Me");
	
		add(l);
		add(b);
		b.addActionListener(this);
		setLayout(new FlowLayout());
		setSize(500,500);
		setLocation(300,100);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		System.out.println("Button pressed now.");	
	}
	public static void main(String args[])
	{
		new myFrame();
	}
}

		