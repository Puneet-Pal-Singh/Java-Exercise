//Write a program to define a class , describe its constructor , overlaod the constructor and initiate the object.

import java.util.*;

class Box 
{ 
    double width, height, depth; 
    Box(double w, double h, double d) 
    { 
        width = w; 
        height = h; 
        depth = d; 
    } 
    Box() 
    { 
        width = height = depth = 0; 
    }  
    Box(double len) 
    { 
        width = height = depth = len; 
    } 
    double volume() 
    { 
        return width * height * depth; 
    } 
}  
public class MyJClass2 
{ 
    public static void main(String args[]) 
    {  
        Box box1 = new Box(10, 24, 14); 
        Box box2 = new Box(); 
        Box box3 = new Box(8); 
        
        double vol; 
        vol = box1.volume(); 
        System.out.println(" Volume of box1 is " + vol); 
        vol = box2.volume(); 
        System.out.println(" Volume of box2 is " + vol); 
        vol = box3.volume(); 
        System.out.println(" Volume of box3 is " + vol); 
    } 
} 
