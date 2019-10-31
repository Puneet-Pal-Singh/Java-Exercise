// Write a program to print all real solution to the Quadratic Solutions ax^2 + bx+c = 0 .
// Read in a,b,c and use the quadratic formula.If the disriminant b^2 - 4ac is negative, display message starting that there are no
// real solutions.
import java.util.*;
public class  MyJClass5
{
    public static void main(String[] args)
    {
        double a, b, c;
        double root1, root2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coefficients of the equation:");
        System.out.println("Enter value of a : ");      
        a=sc.nextDouble();
        System.out.println("Enter value of b : ");
        b=sc.nextDouble();
        System.out.println("Enter value of c : ");
        c=sc.nextDouble();
        double determinant = b * b - 4 * a * c;
    
        if(determinant > 0)
        {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("Real and unequal Solutions Exist. They are: ");
            System.out.println("root1 = "+ root1 + "\nroot2 = " + root2);
        }
      
        else if(determinant == 0)
        {
            root1 = -b / (2 * a);
            root2 = root1;              
            System.out.println("Real and Equal Solutions Exist. They are: ");
            System.out.println(root1 +"and"+ root2);
        }
     
        else
        {
           System.out.println("no real solution");
        }
    }
}
