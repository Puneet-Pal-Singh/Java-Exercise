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

