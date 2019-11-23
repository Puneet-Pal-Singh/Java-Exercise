import java.util.*;
class Counter1 implements Runnable
{
	Thread t1;
	Counter1()
	{
		t1  = new Thread(this, "Thread - 1");
	}
	public void run()
	{
		try
		{
			System.out.println("Good Morning");
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread - 1 Interrupted.");
		}
	}
}

class Counter2 implements Runnable
{
	Thread t2;
	Counter2()
	{
		t2  = new Thread(this, "Thread - 2");
	}
	public void run()
	{
		try
		{
			System.out.println("Hello");
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread - 2 Interrupted.");
		}
	}
}

class Counter3 implements Runnable
{
	Thread t3;
	Counter3()
	{
		t3  = new Thread(this, "Thread - 3");
	}
	public void run()
	{
		try
		{
			System.out.println("Welcome");
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread - 3 Interrupted.");
		}
	}
}
class MyJClass18
{
	public static void main(String args[])
	{
		Counter1 t1 = new Counter1();
		Counter2 t2 = new Counter2();
		Counter3 t3 = new Counter3();
		while(true)
		{
			t1.run(); //sec 1

			t2.run(); //sec 2
			t1.run();

			t3.run(); //sec 3
			t1.run();

			t1.run(); //sec 4
			t2.run();

			t1.run(); //sec 5

			t1.run(); //sec 6
			t2.run();
			t3.run();
		}
	}
}
