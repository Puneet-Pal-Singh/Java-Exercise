//This program introduces Polymorphism and interfaces 

import java.util.Scanner;
class superclass
{
	void add()
	{System.out.println("Inside Super Class");}
}
class subclass extends superclass
{
	void add()
	{System.out.println("Inside Sub Class");}
}
interface superclass1
{
	void add();
}
class subclass1 implements superclass1
{
	public void add()
	{System.out.println("Inside Sub Class of Interface");}
}

class MyJClass12
{
	public static void main(String args[])
	{
		superclass p = new subclass();
		superclass1 q = new subclass1();
		p.add();
		q.add();
	}
}
