// Write a program to prompt the user for an integer and then print out all the prime numbers up to that integer.
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

