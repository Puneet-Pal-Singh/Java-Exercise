// Write a Program to find the biggest of three given Integer numbers or one can ask user to enter the three integer Numbers
import java.util.*;
public class MyJClass1
{
    public static void main(String args[])
    {    
        int x,y,z;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First Number:");
        x = sc.nextInt();      
        System.out.println("Enter the Second Number:");
        y = sc.nextInt();
        System.out.println("Enter the Third Number:");
        z = sc.nextInt();
        if(x>y && x>z)
        {
            System.out.println("Largest Number is:" + x);
        }
        else if(y>z)
        {
            System.out.println("Largest Number is:" + y);
        }
        else
        {
            System.out.println("Largest Number is:" + z);
        }
    }
}


