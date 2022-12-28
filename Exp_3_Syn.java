// Exp No : 3
// Thread Synchronization...
class callme
{
	synchronized public void display(String msg)
	{
		System.out.print("\n[ "+msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
		}
		System.out.println(" ]");
	}
}	
class caller implements Runnable
{
	Thread t;
	callme target;
	String msg;
	
	caller(callme targ,String msg)
	{
		target = targ;
		this.msg=msg;
		t = new Thread(this,msg);
		t.start();
	}
	public void run()	
	{
		target.display(msg);
	}
}
class Exp_3_Syn 
{
	public static void main(String args[])
	{
		callme target = new callme();
		new caller(target,"Hello");
		new caller(target,"Synchronized");
		new caller(target,"World");			
	}
}

