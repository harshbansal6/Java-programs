// Exp No : 2
// Write a program in java to show the concept of the constructor.
class bank 
{
	int balance;
	bank()
	{
		balance=10000;
	}
	bank(int balance)
	{
		this.balance=balance;
	}
	public void display()
	{
		System.out.println("Initial Balance : "+balance);
	}
	public static void main(String args[])
	{
		bank b = new bank();
		bank b1=new bank(50000);
		b.display();
		b1.display();
	}
}
 