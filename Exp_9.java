// Creating a simple JFrame.
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class myJFrame extends JFrame implements ActionListener
{
	JLabel l;
	JButton b;
	JTextField t;
	
	myJFrame()
	{
		super("My First JFrame.");
		l = new JLabel("Enter your name : ");
		b = new JButton("Submit");
		t = new JTextField(10);
	
		add(l);
		add(b);
		add(t);
		setLayout(null);
		
		l.setBounds(70,50,120,20);
		t.setBounds(200,50,140,20);
		b.setBounds(100,100,80,20);
	
		t.setFont(new Font("Sanserif",Font.BOLD,14));
		t.setForeground(Color.blue);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.addActionListener(this);
	
		setLocation(300,100);
		setSize(500,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
JOptionPane.showMessageDialog(this,"Welcome : "+t.getText(),"SGT University",JOptionPane.INFORMATION_MESSAGE);	
		t.setText("");
	}
	public static void main(String args[])
	{
		new myJFrame();
	}
}
	

	












