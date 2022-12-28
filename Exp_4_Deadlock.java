// DeadLock condition into java.
class first extends Thread
{
	Object lock1,lock2;
	first(Object lock1,Object lock2)
	{
		this.lock1=lock1;
		this.lock2=lock2;
	}
	public void run()
	{
		synchronized(lock1)
		{
			System.out.println("Thread first hold lock1.");
			try
			{ 
				Thread.sleep(10); 
			} 
			catch(Exception e) 
			{
				System.out.println(e); 
			}
			System.out.println("Thread first waiting for lock2.");
			synchronized(lock2)
			{
			System.out.println("Thread first hold lock1 & lock2");
			}
		}
	}
}
class second extends Thread
{
	Object lock1,lock2;
	second(Object lock1,Object lock2)
	{
		this.lock1=lock1;
		this.lock2=lock2;
	}
	public void run()
	{
		synchronized(lock2)
		{
			System.out.println("Thread second hold lock2.");
			try
			{ 
				Thread.sleep(10); 
			} 
			catch(Exception e) 
			{
				System.out.println(e); 
			}
			System.out.println("Thread second waiting for lock1.");
			synchronized(lock1)
			{
			System.out.println("Thread second hold lock1 & lock2");
			}
		}	
	}
}

class DeadLock
{
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();
	
	public static void main(String args[])
	{
		first f = new first(lock1,lock2);
		second s = new second(lock1,lock2);
		f.start();
		s.start();
	}
}
