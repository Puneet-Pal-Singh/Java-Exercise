// Fibonacci Sequence 
// It contains both recursive and non recursive functions
// It prints the nth value the fibionacci sequence

// Source Code
import java.util.Scanner;
class MyJClass6
{
	static int v,s;
	public static void fibNrec(int n)
	{
		int[] a = new int[100];
		a[0]=0;
		a[1]=1;
		
		for(int i=2;i<n;i++)
			a[i]=a[i-1] + a[i-2];
		v = a[n-1];
	}
	
	public static void fibRec(int n, int i, int a, int b)
	{
		if(i+2<n)
		{
			s = a + b;
			i++;
			fibRec(n,i,b,s);
		}
			v = s;
	}
	
	public static void main(String args[])
	{
		int c,n;
		System.out.println("Enter number of elements:");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
        System.out.println("Choose Method\n1.Recursive\n2.Non Recursive\n");
        System.out.println("Enter your choice:");
		c = s.nextInt();
		switch(c)
		{
			case 1: fibRec(n,0,0,1);break;
			case 2: fibNrec(n);break;
			default: System.out.println("Invalid choice");
		}
		System.out.println("nth Value of Element Number " + Integer.toString(n) + " is: " + Integer.toString(v));
	}
}
