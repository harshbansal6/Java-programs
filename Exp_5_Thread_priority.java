// Exp No 5
// Thread Priority.
class newThread implements Runnable 
{
	Thread t;
	String tname;
	newThread(String tname)
	{
		this.tname=tname;
		t = new Thread(this,tname);
		t.start();
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(tname+" : "+i);
		}
		System.out.println("Exit from Child Thread : "+ tname);
	}
}
class multi_thread 
{
	public static void main(String args[])
	{
		new newThread("one").t.setPriority(Thread.MIN_PRIORITY); 
		new newThread("two").t.setPriority(Thread.MIN_PRIORITY); 
		new newThread("three").t.setPriority(Thread.MAX_PRIORITY);
	}
}

