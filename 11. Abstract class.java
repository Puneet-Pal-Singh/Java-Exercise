//This is an class Qs
// Shape class Qs

import java.util.*;

abstract class Shape
{
	abstract void numberOfSides();
}
class Trapezoid extends Shape
{
	public void numberOfSides()
	{
		System.out.println("Number of sides is: 4");
	}
}
class Triangle extends Shape
{
	public void numberOfSides()
	{
		System.out.println("Number of sides is: 3");
	}
}
class Rectangle extends Shape
{
	public void numberOfSides()
	{
		System.out.println("Number of sides is: 4");
	}
}
class Hexagon extends Shape
{
	public void numberOfSides()
	{
		System.out.println("Number of sides is: 6");
	}
}
class MyJClass11
{
	public static void main(String arg[])
	{
		int c;
        System.out.println("Menu\n1. Trapezium\n2. Triangle\n3. Rectangle\n4. Hexagon\n");
        System.out.println("Enter the Shape of Choice:");
		Scanner s = new Scanner(System.in);
		c = s.nextInt();
		switch(c)
		{
			case 1: Trapezoid t = new Trapezoid();
					t.numberOfSides();break;
			case 2: Triangle q = new Triangle();
					q.numberOfSides();break;
			case 3: Rectangle r = new Rectangle();
					r.numberOfSides();break;
			case 4: Hexagon h = new Hexagon();
					h.numberOfSides();break;
			default: System.out.println("Invalid Choice");
		}
	}
}
