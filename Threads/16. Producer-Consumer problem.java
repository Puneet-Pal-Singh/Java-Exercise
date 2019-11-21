import java.util.*;
class Q
{
	boolean ValueSet = false;
	int  n;
	synchronized int get()
	{
		while(ValueSet == false)
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("Interrupted Exception");
			}
		System.out.println("Consumer got: " + n);
		ValueSet = false;
		notify();
		return n;
	}
	synchronized void put(int n)
	{
		while(ValueSet == true)
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("Interrupted Exception");
			}
		System.out.println("Producer put: " + n);
		this.n = n;
		ValueSet = true;
		notify();
	}
}
class Producer implements Runnable
{
	Q q;
	Producer(Q q)
	{
		this.q = q;
		new Thread(this, "Producer").start();
	}
	public void run()
	{
		int i = 0;
		while(true)
		{q.put(i++);}
	}
}
class Consumer implements Runnable
{
	Q q;
	Consumer(Q q)
	{
		this.q = q;
		new Thread(this, "Consumer").start();
	}
	public void run()
	{
		while(true)
		{q.get();}
	}
}
class MyJClass16
{
	public static void main(String args[])
	{
	Q q = new Q();
	new Producer(q);
	new Consumer(q);
	System.out.println("Press Ctrl - C to stop.");
	}
}
