package ab45_assignments;

import java.util.Scanner;

//Assignment 23: Area of Circle using Math.random

public class Assignment23_AreaOfCircle_mathClass {
	
	public static double areaOfCircle(double radius)
	{
		double circleArea = Math.PI*radius*radius;	
		return circleArea;
	}
	
	public static void main(String[] args) 
    {
      	Scanner sc = new Scanner(System.in);
    	System.out.println("\nEnter radius for circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle: " + areaOfCircle(radius));	           
           
    }
}
