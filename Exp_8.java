// Exp No 8
// Create JButton on JFrame.
import javax.swing.*;
import java.awt.event.*;
class myJFrame_B extends JFrame implements ActionListener
{
	JButton b;
	myJFrame_B()
	{
		super("Experiment No 8");
		b = new JButton("Click Me");
		add(b);
		setLayout(null);
		b.setBounds(200,120,100,20);
		add(b);
		b.addActionListener(this);
		setSize(500,500);
		setLocation(300,100);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
	JOptionPane.showMessageDialog(this,"Button Pressed now.","OK Done",JOptionPane.INFORMATION_MESSAGE);	
	}
	public static void main(String args[])
	{
		new myJFrame_B();
	}
}

			


