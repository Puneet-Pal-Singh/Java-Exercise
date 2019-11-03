// Line of integers
// Program to reads a line of integers and display each integer and the sum of all integers.

import java.util.*;

public class MyJClass10
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter sequence of integers with space b/w them and press enter : ");
        String digit = sc.nextLine();
        StringTokenizer token = new StringTokenizer(digit);
        int dig=0,sum=0;
                        
        System.out.println("\nEntered digits are : ");
        
        while(token.hasMoreTokens())
        {
            String s = token.nextToken();
            dig = Integer.parseInt(s);
            System.out.println(dig+" ");
            sum = sum+dig;
        }
        System.out.println();
        System.out.println("Sum is : "+sum);

    }
}

