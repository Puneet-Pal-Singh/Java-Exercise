// This program prints whether a number is prime or not
import java.util.*;
public class Primepr{    
 public static void main(String args[])
 {    
  int i,m=0,flag=0;      
  int n=50;//it is the number to be checked            
  if(n==0||n==1)
  {  
   System.out.println(n+" is not prime number");      
  }
  else
  {  
   for(i=2;i<=m;i++){      
    if(n%i==0)
	{      
     System.out.println(n+" is not prime number");      
     flag=1;      
     break;      
    }      
  }      
   if(flag==0)  { System.out.println(n+" is prime number"); }  
  }//end of else  
}    
}   


//This program prints the series.
import java.util.Scanner;
class PrimeNumberstwo
{
   public static void main (String[] args)
   {		
      Scanner sc = new Scanner(System.in);
      int i =0;
      int num =0;
      //Empty String
      String  primeNumbers = "";
      System.out.println("Enter the value of n:");
      int n = sc.nextInt();
      sc.close();
      for (i = 1; i <= n; i++)  	   
      { 		 		  
         int counter=0; 		  
         for(num =i; num>=1; num--)
         {
	    if(i%num==0)
	    {
		counter = counter + 1;
	    }
	 }
	 if (counter ==2)
	 {
	    //Appended the Prime number to the String
	    primeNumbers = primeNumbers + i + " ";
	 }	
      }	
      System.out.println("Prime numbers from 1 to n are :");
      System.out.println(primeNumbers);
   }
}


// This program prompts the user for an integer and then print out all the prime numbers up to that integer.
import java.util.*;
import java.util.Scanner;
class MyJClass7
{
 static int[] a = new int[100];
 static int k = 0;
 public static void PrimeCalc(int n)
 {
  int i,j,flag = 0;
  for(i=2;i<=n;i++)
  {
	flag = 0;
	for(j=2;j<i;j++)
	{
		 if(i%j==0)
	 	{
	 		flag = 1;
			break;
	 	}
	 	else
	 	{
			flag = 0;
     	}
	}
	if(flag == 0)
	{
		a[k] = i;
		k++;
	}
		
  }
 }
 
 public static void main(String args[])
 {
	 int n;
	 System.out.println("Enter Number upto which Prime numbers are to be found: ");
	 Scanner s = new Scanner(System.in);
	 n=s.nextInt();
	 PrimeCalc(n);
	 System.out.println("The prime numbers upto " + Integer.toString(n) + " are:");
	 for(int x=0;x<k;x++)
		 System.out.println(Integer.toString(a[x]));
 }
}

