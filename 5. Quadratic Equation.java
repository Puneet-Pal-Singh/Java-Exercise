// Write a program to print all real solution to the Quadratic Solutions ax^2 + bx+c = 0 .
// Read in a,b,c and use the quadratic formula.If the disriminant b^2 - 4ac is negative, display message starting that there are no
// real solutions.
import java.util.*;
public class Quadratic
{
    public static void main(String[] args)
    {
        double a, b, c;
        double root1, root2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a : ");      
        a=sc.nextDouble();
        System.out.println("enter value of b : ");
        b=sc.nextDouble();
        System.out.println("enter value of c : ");
        c=sc.nextDouble();
        double determinant = b * b - 4 * a * c;
    
        if(determinant > 0)
        {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("root1 = "+ root1 + "root2 = " + root2);
        }
      
        else if(determinant == 0)
        {
            root1 = root2 = -b / (2 * a);
            System.out.println("root1 = root2 = "+ root1);
        }
     
        else
        {
           System.out.println("no real solution");
        }
    }
}
