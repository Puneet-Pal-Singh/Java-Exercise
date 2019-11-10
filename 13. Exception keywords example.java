// 5 Exception Keywords
import java.util.Scanner;
class MyException extends Exception
{
	MyException(int a)
	{
		System.out.println("Exception Number: " + a);
	}
}
class MyJClass13
{
	static void compute(int a) throws MyException
	{
		System.out.println("Called compute(" + a + ")");
		if(a>10)
			throw new MyException(a);
		System.out.println("Normal Exit");
	}
	public static void main(String rgs[])
	{
		try
		{
			compute(1);
			compute(20);
		}
		catch(MyException e)
		{
			System.out.println("Caught " + e);
		}
	}
} 
