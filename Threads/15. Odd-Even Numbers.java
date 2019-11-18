import java.util.*;
class Counter implements Runnable
{
	Thread o;
	Counter()
	{
		o  = new Thread(this, "Odd Thread");
		o.start();
	}
	synchronized public void run()
	{
		try
		{ 
			for(int i = 2; i>0; i+=2)
				{
					System.out.println("Even Thread: " + i);
					Thread.sleep(500);
				}
		}

		catch(InterruptedException e)
		{
			System.out.println("Even Interrupted.");
		}
	}
}
class MyJClass15
{
	public static void main(String args[])
	{
		new Counter();
		try
		{ 
			for(int i = 1; i>0; i+=2)
				{
					System.out.println("Odd Thread: " + i);
					Thread.sleep(500);
				}
		}
		catch(InterruptedException e)
		{
			System.out.println("Odd Interrupted.");
		}
	}
}


