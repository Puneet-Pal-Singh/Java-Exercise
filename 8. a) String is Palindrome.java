// Write a program to check whether a given string is palindrome or not. 
import java.util.Scanner;
 
class Palindrome
{
   public static void main(String args[])
   {
      String str, r = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      str = sc.nextLine();
 
      int length = str.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         r = r + str.charAt(i);
 
      if (str.equals(r))
         System.out.println(str+" is a palindrome");
      else
         System.out.println(str+" is not a palindrome");
 
   }
}
